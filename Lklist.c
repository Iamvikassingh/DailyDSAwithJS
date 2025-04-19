#include<stdio.h>
#include<stdlib.h>

typedef struct Lklist
{
    int info;
    struct Lklist *next;
}node;

void main(){
    struct Lklist *head, *temp, *newnode; //these are variables having pointer
    int n, i;   
    head = (node*)malloc(sizeof(node)); // here we declared the the dynamic memory. malloc assign the address 
    head->info = 0;
    head->next = NULL;
    temp = head;

    printf("1 - Insert at beginning\n");
    printf("2 - Traversing the list\n");
    printf("3 - Insert at the end\n");
    printf("4 - Search\n");
    printf("5 - print the linked list\n");
    printf("6 - Delete at the beginning\n");
    printf("7 - Delete at the end\n");
    printf("8 - Delete at the specific positon\n");
    printf("9 - end\n");
    while(1){
        printf("Enter your choice: ");
        scanf("%d", &n);
        switch(n){
            case 1:
                newnode = (node*)malloc(sizeof(node));
                printf("Enter the value: ");
                scanf("%d", &newnode->info);
                newnode->next = head; 
                head = newnode;
                break;
            case 2:
                temp = head;
                while(temp != NULL){
                    printf("%d\n", temp->info);
                    temp = temp->next;
                }
                break;
            case 3:
                newnode = (node*)malloc(sizeof(node));
                printf("Enter the value: ");
                scanf("%d", &newnode->info);
                newnode->next = NULL;
                temp = head;
                while(temp->next != NULL){
                    temp = temp->next;
                }
                temp->next = newnode;
                break;

            case 4:
                printf("Enter the value to search: ");
                scanf("%d", &n);
                temp = head;
                while(temp != NULL){
                    if(temp->info == n){
                        printf("Element found\n");
                        break;
                    }
                    temp = temp->next;
                }
                if(temp == NULL){
                    printf("Element not found\n");
                }
                break;
            case 5:
            temp = head;
            while(temp != NULL){
                printf("%d\n", temp->info);
                temp = temp ->next;
            }
            break;
            case 6:
                if (head == NULL) {
                    printf("List is empty.\n");
                } else {
                    temp = head;         
                    head = head->next;   
                    printf("Deleted: %d\n", temp->info);
                    free(temp);       
                }
                break;
            case 7:
                if (head == NULL) {
                    printf("List is empty.\n");
                } else {
                    temp = head;
                    while (temp->next->next != NULL) {
                        temp = temp->next;
                    }
                    printf("Deleted: %d\n", temp->next->info);
                    free(temp->next); 
                    temp->next = NULL; 
                }
            break;
            case 8:
            if(head == NULL){
                printf("List is empty\n");
            }
            else{
                printf("Enter the position want to delete\n");
                scanf("%d",&n);
                temp = head;
                for(int i = 0 ; i < n-1;i++){
                    temp = temp -> next;
                }
                printf("Deleted: %d\n",temp->next->info );
                free(temp->next);
                temp->next = NULL;
            }
            break;
            case 9:
                exit(0);
                
            default:
            printf("Enter choice is wrong please choose right choice \n");
        }
    }
}

//linear order complexcity O(n)