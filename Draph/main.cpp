///Primer avance en c++
#include<bits/stdc++.h>
#include<iostream>
#include<fstream>
#include<stdlib.h>
#include<string.h>
#include<ctype.h>
#include <Python.h>

using namespace std;

vector<string> identificadores;


int is_keyword(string buffer){
    int flag = 0;
    vector<string> keywords;
    keywords = {"int", "float" , "string", "main" , "cg" , "cg_var" , "gnv" , "gnv_var" , "gnu", "gnu_var", "vector", "insert", "read", "delete" , "funcion", "if", "else", "for", "print"};
    for(int i = 0; i < keywords.size(); i++){
        if(buffer == keywords[i]){
            flag = -1;
            break;
        }
    }
    return flag;
}

///EL PROGRAMA AUN NO EJECUTA COMO SE QUIERE

int main()
{
    PyObject* pInt;
    Py_Initialize();
    char filename[] = "helper.py";
	FILE* fp;
	Py_Initialize();
	fp = _Py_fopen(filename, "r");
	PyRun_SimpleFile(fp, filename);
	Py_Finalize();
	return 0;
    /*Py_Finalize();
    ifstream lecture("archivo.txt");
    if(!lecture.is_open()){
		cout<<"Error de lectura de archivo DRAPH\n";
		exit(0);
	}
	while(!lecture.eof()){
        string linea;
        vector<string> tokens;
	}

    return 0;*/
}

