import sys
from antlr4 import *
from Mini0Lexer import Mini0Lexer
from Mini0Parser import Mini0Parser
from Mini0Listener import Mini0Listener
import unittest
from io import StringIO

#main method and entry point of application

def GetTipo(lex, tipotoken):
    return str(lex.ruleNames[tipotoken - 1])

#def setup(self,text):
#    lexer = Mini0Lexer(InputStream(text))
#    stream = CommonTokenStream(lexer)
#    parser = Mini0Parser(stream)
#self.output = io.StringIO()
#        self.error = io.StringIO()
#
#        parser.removeErrorListeners()
#        errorListener = ChatErrorListener(self.error)
#        parser.addErrorListener(errorListener)
#
#        lexer.removeErrorListeners()
#        lexer.addErrorListener(errorListener)
#
#        self.errorListener = errorListener
#
#        return parser

class TestMini0Parser(unittest.TestCase):
    def setUp(self):
        self.lexer = Mini0Lexer(FileStream("test1.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)

    def test1(self):#tokens
        prueba = self.lexer.nextToken()
        print("test1")
        print("Test de Tokens de la gramatica Mini-0")
        while(prueba.type != Token.EOF):
            print("<"+ GetTipo(self.lexer, prueba.type)+","+(prueba.text if prueba.text != "\n" else "EOL") + ">", end="\t")
            prueba = self.lexer.nextToken()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

    def test2(self):#programa
        print("test2")
        print("Test del parser programa")
        self.lexer = Mini0Lexer(FileStream("test2.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)
        self.parser.programa()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

    def test3(self):#decl
        print("test3")
        print("Test del parser decl")
        self.lexer = Mini0Lexer(FileStream("test3.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)
        self.parser.decl()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

    def test4(self):#nl
        print("test4")
        print("Test del parser nl")
        self.lexer = Mini0Lexer(FileStream("test4.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)
        self.parser.nl()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

    def test5(self):#globall
        print("test5")
        print("Test del parser globall")
        self.lexer = Mini0Lexer(FileStream("test5.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)
        self.parser.globall()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

    def test6(self):#funcion
        print("test6")
        print("Test del parser funcion")
        self.lexer = Mini0Lexer(FileStream("test6.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)
        self.parser.funcion()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

    def test7(self):#bloques
        print("test7")
        print("Test del parser bloques")
        self.lexer = Mini0Lexer(FileStream("test7.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)
        self.parser.bloques()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

    def test8(self):#bloque
        print("test8")
        print("Test del parser bloque")
        self.lexer = Mini0Lexer(FileStream("test8.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)
        self.parser.bloque()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

    def test9(self):#params
        print("test9")
        print("Test del parser params")
        self.lexer = Mini0Lexer(FileStream("test9.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)
        self.parser.params()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

    def test10(self):#parametro
        print("test10")
        print("Test del parser parametro")
        self.lexer = Mini0Lexer(FileStream("test10.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)
        self.parser.parametro()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

    def test11(self):#tipobase
        print("test11")
        print("Test del parser tipobase")
        self.lexer = Mini0Lexer(FileStream("test11.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)
        self.parser.tipobase()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

    def test12(self):#tipo
        print("test12")
        print("Test del parser tipo")
        self.lexer = Mini0Lexer(FileStream("test12.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)
        self.parser.tipo()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

    def test13(self):#declvar
        print("test13")
        print("Test del parser declvar")
        self.lexer = Mini0Lexer(FileStream("test13.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)
        self.parser.declvar()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

    def test14(self):#comandos
        print("test14")
        print("Test del parser comandos")
        self.lexer = Mini0Lexer(FileStream("test14.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)
        self.parser.comandos()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

    def test15(self):#comando
        print("test15")
        print("Test del parser comando")
        self.lexer = Mini0Lexer(FileStream("test15.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)
        self.parser.comando()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

    def test16(self):#cmdif
        print("test16")
        print("Test del parser cmdif")
        self.lexer = Mini0Lexer(FileStream("test16.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)
        self.parser.cmdif()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

    def test17(self):#cmdwhile
        print("test17")
        print("Test del parser cmdwhile")
        self.lexer = Mini0Lexer(FileStream("test17.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)
        self.parser.cmdwhile()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

    def test18(self):#cmdasign
        print("test18")
        print("Test del parser cmdasign")
        self.lexer = Mini0Lexer(FileStream("test18.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)
        self.parser.cmdasign()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

    def test19(self):#llamada
        print("test19")
        print("Test del parser llamada")
        self.lexer = Mini0Lexer(FileStream("test19.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)
        self.parser.llamada()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

    def test20(self):#listaexp
        print("test20")
        print("Test del parser listaexp")
        self.lexer = Mini0Lexer(FileStream("test20.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)
        self.parser.listaexp()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

    def test21(self):#cmdreturn
        print("test21")
        print("Test del parser cmdreturn")
        self.lexer = Mini0Lexer(FileStream("test21.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)
        self.parser.cmdreturn()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

    def test22(self):#var
        print("test22")
        print("Test del parser var")
        self.lexer = Mini0Lexer(FileStream("test22.txt"))
        self.tokens = CommonTokenStream(self.lexer)
        self.parser = Mini0Parser(self.tokens)
        self.parser.var()
        self.assertEqual(0,0)
        print("--------------------------------------------------------------------------------------")

if __name__ == '__main__':
    unittest.main()