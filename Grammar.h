#include "Production.h"

struct Gramatica {
	vector<Produccion*> production;
	map<string,bool> terminals;
	map<string,bool> noterminals;
};
