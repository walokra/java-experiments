# Ajoneuvojen tekniset tiedot

Hakusovellus TraFin avoimen datan "ajoneuvojen tekniset tiedot" -aineistoon.

## Teknologia

### Sovellus

Hakusovellus koostuu käyttöliittymästä ja taustajärjestelmästä. Käyttöliittymä on HTML5-sovellus, joka hakee tiedot REST-rajapinnan kautta taustajärjestelmästä.

Sovelluksen REST-rajapinnan taustajärjestelmä on Java-sovellus, joka on toteutettu käyttäen Spring Boot, Spring Data Rest, Gradle ja Maven -teknologioita. Tietokantana käytetään PostgreSQL 9.3:sta.

### Esimerkit

$ curl http://localhost:8080
$ curl http://localhost:8080/tekniset-tiedot
$ curl http://localhost:8080/tekniset-tiedot?size=2&sort=merkkiselvakielinen
$ curl http://localhost:8080/tekniset-tiedot/1
$ curl http://localhost:8080/tekniset-tiedot/search
$ curl http://localhost:8080/tekniset-tiedot/search/findByKaupallinenNimi?malli=CEED

### Tietokanta

Ennen tietokantaan vientiä Excel-taulukkomuodossa olevaa dataa pitää hieman muokata. 1. Vaihdetaan kenttäerotin, koska datassa on desimaalilukuja. 2. Konvertoidaan UTF-8:ksi 3. Poistetaan ensimmäinen rivi, jossa on sarakkeiden nimet. Kenttäerotin on , joka vaihdetaan | -merkiksi, paitsi jos se on hipsujen sisällä.

Tekniset tiedot:

1. Vaihdetaan kenttäerotin
	awk 'BEGIN{FS=OFS="\""} {for (i=1;i<=NF;i+=2) gsub(/,/,"|",$i)}1' data.csv > data_clean.csv
2. Muunnetaan aineisto utf-8:ksi
	iconv -f iso8859-15 -t utf8 data_clean.csv > data_utf8.csv
3. Poistetaan otsikkorivi
	sed -i '' '1 d' data_utf8.csv
4. Rivejä pitäisi olla 5069929
	wc -l data_utf8.csv

Koodisto:

1. Tallennetaan xlsx-tiedosto CSV-tiedostoksi esim. LibreOfficess
2. Poistetaan otsikkorivi
	sed -i '' '1 d' koodisto.csv
3. Tehdään import
	COPY koodisto FROM 'koodisto.csv' WITH DELIMITER ',' CSV;

Kannan luonti ja avoimen datan importointi esim. PostgreSQL-kantaan. 

Luodaan tarvittavat taulut ja näkymä:
- sql/tekniset_tiedot.sql
- sql/koodisto.sql
- sql/tekniset_tiedot_view.sql

Importoidaan data. CSV-tiedostossa kenttien erotinmerkki on |.

$ psql ajoneuvotiedot
ajoneuvotiedot=# COPY tekniset_tiedot FROM 'data_utf8.csv' DELIMITER '|' CSV;
COPY 5069929

## TraFi avoin data 

Avoin data -aineisto versio 2.0, ajankohta 31.8.2014

Avoin data -aineisto 2.0 sisältää kaikkien liikennekäytössä olevien ajoneuvojen rekisteröinti-, hyväksyntä- ja teknisiä tietoja Trafin ylläpitämästä ajoneuvoliikennerekisteristä.

Sovelluksessa käytetty data on saatavissa TraFin sivuilta: http://www.trafi.fi/tietopalvelut/avoin_data.

# Lisenssi

Sovellus: MIT

TraFin data: http://www.trafi.fi/tietopalvelut/avoin_data/avoimen_datan_lisenssi

# Tekijä

Marko Wallin <mtw@iki.fi>
