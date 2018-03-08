#include <iostream.h>
#include <conio.h>

class Nodo{
	private:
   	int d;
      Nodo *sig,*ant;

      public:
      Nodo(int d){
      	this->d=d;
         sig=ant=NULL;

      }

      ~Nodo(){}

      //Setters
      void setD(int e){
      	d=e;
      }

      void setSig(Nodo *n){
      	sig=n;
      }

      void setAnt(Nodo *a){
      	ant=a;
      }

      //Getters
      int getD(){
      	return d;
      }

      Nodo *getSig(){
      	return sig;
      }

      Nodo *getAnt(){
      	return ant;
      }

      void verNodo(){
      	cout<<"["<<d<<"]";
      }






};//Nodo

class ListaDC{

	private:
		Nodo *inicio, *fin;

   public:
   	ListaDC(){
   		inicio=fin=NULL;
   	}

      void insertar(int a){
        if(inicio==NULL)
            inicio=fin=new Nodo(a);
        else{
            fin->setSig(new Nodo(*a));
            fin->getSig().setAnt(fin);
            fin=fin->getSig();
            fin->setSig(inicio);
            inicio->setAnt(fin);
        }
    }

    Nodo *existe(int nca){
        for(Nodo *i=inicio; i!=fin;i=i.getSig())
            if(i->getD()==nca)
                return i;

        if(fin.getD==nca)
            return fin;
        else
            return NULL;

    }

    void eliminar(int nca){
        Nodo *temp=existe(nca);

        if(temp==inicio){
            inicio.getSig().setAnt(fin);
            inicio=inicio.getSig();
            fin.setSig(inicio);
            //temp=null;
        }
        else if(temp==fin){
            fin.getAnt().setSig(inicio);
            fin=fin.getAnt();
            inicio.setAnt(fin);
        }
        else{
            temp.getAnt().setSig(temp.getSig());
            temp.getSig().setAnt(temp.getAnt());
        }
        delete temp;//No necesaria

    }

    void verLista(){
    	for(Nodo *i=inicio; i!=fin;i=i.getSig())
      	i->verNodo();


      fin->verNodo();

    }


};

void main(){
	ListaDC a;

   a.insertar(2);
   a.insertar(3);
   a.insertar(4);
   a.verLista(); getch();
   a.eliminar(2);
   a.verLista(); getch();


}