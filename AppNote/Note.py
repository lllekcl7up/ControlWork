from datetime import datetime
import uuid


class Note:
    def __init__(self, id = str(uuid.uuid1())[0:3],  name = "текст", body = "текст", date = str(datetime.now().strftime("%d.%m.%Y %H:%M:%S"))):
        self.id = id
        self.name = name
        self.body = body
        self.date = date

    def get_id(note):
        return note.id

    def get_name(note):
        return note.name

    def get_body(note):
        return note.body

    def get_date(note):
        return note.date

    def set_id(note):
        note.id = str(uuid.uuid1())[0:3]

    def set_name(note, name):
        note.name = name

    def set_body(note, body):
        note.body = body

    def set_date(note):
        note.date = str(datetime.now().strftime("%d.%m.%Y %H:%M:%S"))

    def to_string(note):
        return note.id + ';' + note.name + ';' + note.body + ';' + note.date

    def map_note(note):
        return '\nID: ' + note.id + '\n' + 'Название: ' + note.name + '\n' + 'Текст: ' + note.body + '\n' + 'Дата публикации: ' + note.date
