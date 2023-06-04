import Note


def write_file(array, mode):
    file = open("database.csv", mode='w', encoding='utf-8')
    file.seek(0)
    file.close()
    file = open("database.csv", mode=mode, encoding='utf-8')
    for database in array:
        file.write(Note.Note.to_string(database))
        file.write('\n')
    file.close


def read_file():
    try:
        array = []
        file = open("database.csv", "r", encoding='utf-8')
        database = file.read().strip().split("\n")
        for n in database:
            split_n = n.split(';')
            note = Note.Note(
                id = split_n[0], name = split_n[1], body = split_n[2], date = split_n[3])
            array.append(note)
    except Exception:
        print('Заметки отсутствуют')
    finally:
        return array
