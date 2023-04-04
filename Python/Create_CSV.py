import csv
import openpyxl
#import pandas as pandasForSortingCSV


def create_new_countries_csv():
     
    country_names_list = [] # H lista tou countries.csv.
    country_names_area_list = []    # H lista tou country_names_area.
    
    with open('countries.csv') as file:
        file_data = csv.reader(file, delimiter = ',')  # load csv file separated by commas.
        country_names_list.append(next(file_data))
        country_names_list[-1].append('Country_area')   # Kane append allo ena header sthn teleutaia thesi tou 1ou row.
        for row in file_data:
            country_names_list.append(row)
    for row in country_names_list:
        for column in range(23):
            if row[column] == '':
                row[column] = 'NULL'    # Opou uparxei keno sto csv bainei NULL.
    
    with open('country_names_area.csv') as file:
        file_data = csv.reader(file, delimiter = ',')  # load csv file separated by commas.
        for row in file_data:
            country_names_area_list.append(row)

    # Diplh for oste na brisko ama uparxei h xora tou country_names_area.csv sto countries.csv:

    for x in range(len(country_names_area_list) - 1):
        for y in range(len(country_names_list) - 1):
            if country_names_area_list[x][1] == country_names_list[y][4]:
                country_names_list[y].append(country_names_area_list[x][2]) # An uparxei, tote sto row pou to brhka prostheto sto column tou neou Header Country_area ton kodiko tou country_names_area.csv.

    # Merikes xores tou countries.csv den uparxoun sto country_names_area.csv opote sthn thesi twn kenwn pou dhmiourgounte vazo NULL:

    for x in range(len(country_names_list)):
        if len(country_names_list[x]) == 24:
            country_names_list[x].append('NULL')

    # Dhmiourgo ena kainourio csv arxeio kai tou fortono thn country_names_list:

    with open('new_countries.csv', 'w') as file:
        writer = csv.writer(file, lineterminator = '\n')

        for row in range(len(country_names_list)):
            writer.writerow(country_names_list[row])

    return country_names_list

############################################################################################################################################################

def sorting_country_year(filename):

    # Kano sort me vash to onoma ths xoras kai th xronia:

    header = []

    with open(filename, 'r') as csvfile:
        reader = csv.reader(csvfile)

        for i, row in enumerate(reader):    # Ksexorizo to header prin kano sort.
            if i == 0:
                header.append(row)
                break

        rows = list(reader)
        rows.sort(key=lambda row: (row[1], row[2])) # Kano sort me vash to country_name kai ta year.

    # Dhmiourgo ena kainourio csv arxeio kai tou fortono to sorted list rows:

    filename = filename.replace('.csv', '_')
    with open(f'{filename}output.csv', 'w', newline='') as csvfile:
        writer = csv.writer(csvfile)    
        writer.writerows(header)    # Grafo prota to header.
        writer.writerows(rows)      # Sumplhrono ta sorted dedomena.

    return 1

def add_iso_code(countries_list, csvfile):
    
    csv_list = []

    with open(csvfile) as file:
        file_data = csv.reader(file, delimiter = ',')  # load csv file separated by commas.
        for row in file_data:
            csv_list.append(row)

    csv_list[0].append('ISO_Code')   # Kane append allo ena header sthn teleutaia thesi tou 1ou row.

    for x in range(len(csv_list) - 1):
        for y in range(len(countries_list)):
            if csv_list[x + 1][1] == countries_list[y][4]:
                csv_list[x + 1].append(countries_list[y][2])
    
    #x = 13
    #for y in range(len(csv_list)):
        #while x > 1:
            #print(csv_list[y][x])
            #csv_list[y][x], csv_list[y][x - 1] = csv_list[y][x - 1], csv_list[y][x]
            #x -= 1
        #x = 13


    #csvfile = csvfile.replace('_.csv', '_.csv')
    with open(f'{csvfile}', 'w', newline='') as csvfile:
        writer = csv.writer(csvfile)    
        writer.writerows(csv_list)


    return 1

def create_from_xlsx(filename):

    workbook = openpyxl.load_workbook('Income by Country.xlsx')
    



    return 1


#########################################################################################################################################################

def main():

    my_countries =  create_new_countries_csv()

    sorting_country_year('age_specific_fertility_rates.csv')
    add_iso_code(my_countries, 'age_specific_fertility_rates_output.csv')

    sorting_country_year('birth_death_growth_rates.csv')
    add_iso_code(my_countries, 'birth_death_growth_rates_output.csv')

    sorting_country_year('midyear_population_age_sex.csv')
    add_iso_code(my_countries, 'midyear_population_age_sex_output.csv')

    sorting_country_year('midyear_population_5yr_age_sex.csv')
    add_iso_code(my_countries, 'midyear_population_5yr_age_sex_output.csv')

    sorting_country_year('mortality_life_expectancy.csv')
    add_iso_code(my_countries, 'mortality_life_expectancy_output.csv')

    sorting_country_year('midyear_population.csv')
    add_iso_code(my_countries, 'midyear_population_output.csv')

    #create_from_xlsx('Income by Country.xlsx')

    return 1


###########################################################################################
#                                          START                                          #
###########################################################################################


main()