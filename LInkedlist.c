#include<stdio.h>
#include<conio.h>


// Singly linked list structure 
struct NODE
{
    int data;
    struct NODE* next;
};

//this function will create the new node
struct Node*createANewNode(int data){
    //memory allocation 
    struct NODE* newNode = (struct NODE*)malloc(sizeof(struct NODE));
    newNode ->data=data;
    newNode ->next=NULL;
}

struct Node*insetAtTheFirst(struct NODE** head,int data){
    struct NODE* newNode = createANewNode(data);
    newNode ->next=*head;
    *head -> newNode;
}

void main(){
    int n;
    printf("1 : create a node\n");


    printf("Enter Your Choise");
    scanf("%d",&n);
    switch (n)
    {
    case 1:
        int x;
        printf("Enter the number");
        scanf("%d",&x);
        createANewNode(x);
        break;
    
    default:
        printf("invalid choice");
        break;
    }
}