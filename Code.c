//
// Definition for singly-linked list:
// typedef struct list_##name {
//   type value;
//   struct list_##name *next;
// } list_##name;
//
// list_##name *alloc_list_##name(type v) {
//   list_##name *l = calloc(1, sizeof(list_##name));
//   l->value = v;
//   return l;
// }
//
list_integer * removeKFromList(list_integer * l, int k) {

        if(l != NULL){
                if(l->value == k)
                        return removeKFromList(l->next, k);
                else
                        l->next = removeKFromList(l->next, k);
        }
        
        return l;
}
