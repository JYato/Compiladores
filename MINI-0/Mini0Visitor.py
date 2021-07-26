# Generated from Mini0.g4 by ANTLR 4.9.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .Mini0Parser import Mini0Parser
else:
    from Mini0Parser import Mini0Parser

# This class defines a complete generic visitor for a parse tree produced by Mini0Parser.

class Mini0Visitor(ParseTreeVisitor):

    # Visit a parse tree produced by Mini0Parser#programa.
    def visitPrograma(self, ctx:Mini0Parser.ProgramaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini0Parser#decl.
    def visitDecl(self, ctx:Mini0Parser.DeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini0Parser#nl.
    def visitNl(self, ctx:Mini0Parser.NlContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini0Parser#globall.
    def visitGloball(self, ctx:Mini0Parser.GloballContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini0Parser#funcion.
    def visitFuncion(self, ctx:Mini0Parser.FuncionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini0Parser#bloques.
    def visitBloques(self, ctx:Mini0Parser.BloquesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini0Parser#bloque.
    def visitBloque(self, ctx:Mini0Parser.BloqueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini0Parser#params.
    def visitParams(self, ctx:Mini0Parser.ParamsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini0Parser#parametro.
    def visitParametro(self, ctx:Mini0Parser.ParametroContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini0Parser#tipobase.
    def visitTipobase(self, ctx:Mini0Parser.TipobaseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini0Parser#tipo.
    def visitTipo(self, ctx:Mini0Parser.TipoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini0Parser#var.
    def visitVar(self, ctx:Mini0Parser.VarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini0Parser#declvar.
    def visitDeclvar(self, ctx:Mini0Parser.DeclvarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini0Parser#comandos.
    def visitComandos(self, ctx:Mini0Parser.ComandosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini0Parser#comando.
    def visitComando(self, ctx:Mini0Parser.ComandoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini0Parser#cmdif.
    def visitCmdif(self, ctx:Mini0Parser.CmdifContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini0Parser#cmdwhile.
    def visitCmdwhile(self, ctx:Mini0Parser.CmdwhileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini0Parser#cmdasign.
    def visitCmdasign(self, ctx:Mini0Parser.CmdasignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini0Parser#llamada.
    def visitLlamada(self, ctx:Mini0Parser.LlamadaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini0Parser#listaexp.
    def visitListaexp(self, ctx:Mini0Parser.ListaexpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini0Parser#cmdreturn.
    def visitCmdreturn(self, ctx:Mini0Parser.CmdreturnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by Mini0Parser#exp.
    def visitExp(self, ctx:Mini0Parser.ExpContext):
        return self.visitChildren(ctx)



del Mini0Parser