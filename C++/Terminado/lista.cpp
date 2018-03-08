#include<iostream.h>
#include<conio.h>


class Nodo{
   private:
     int d;
     Nodo *sig,*ant;
   public:
     Nodo(int d){this->d=d; sig=ant=NULL;}
     ~Nodo(){}
     void setD(int e){d=e;}
     int getD(){return d;}
     void setSig(Nodo *p){sig=p;}
     Nodo *getSig(){return sig;}
     void setAnt(Nodo *p){ant=p;}
     Nodo *getAnt(){return ant;}
     void verNodo(){cout<<"["<<d<<"]";}
};  //clase Nodo

class ListaDC{
   private:
     Nodo *inicio,*fin;
   public:
     ListaDC(){inicio=fin=NULL;}
     void insertar(int a){
        if(inicio==NULL)inicio=fin=new Nodo(a);
        else {
            fin->setSig(new Nodo(a));
            fin->getSig()->setAnt(fin);
            fin=fin->getSig(); fin->setSig(inicio);
            inicio->setAnt(fin);
        }
    }//insertar
    Nodo *existe(int nca){
        for(Nodo *i=inicio; i!=fin;i=i->getSig())
            if(i->getD()==nca) return i;

        if(fin->getD()==nca) return fin;
        else return NULL;
    }//existe

    void eliminar(int nca){
        Nodo *e=existe(nca);
        if(e==inicio){
            inicio->getSig()->setAnt(fin);
            inicio=inicio->getSig();
            fin->setSig(inicio);
        }else if(e==fin){
            fin->getAnt()->setSig(inicio);
            fin=fin->getAnt();
            inicio->setAnt(fin);
        }
        else{
            e->getAnt()->setSig(e->getSig());
            e->getSig()->setAnt(e->getAnt());
        }
        delete e; //libera memoria
    }//eliminar
    void verLista(){
        for(Nodo *i=inicio; i!=fin;i=i->getSig())
            i->verNodo();
        fin->verNodo(); cout<<endl;
     }//verLista
}; //clase ListaDC

void main( ){
   ListaDC a;
   a.insertar(2);
   a.insertar(0);
   a.insertar(1);
   a.insertar(8);
   a.verLista();  getch();
   a.eliminar(9);
   a.verLista();  getch();
}







