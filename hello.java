{\rtf1\ansi\ansicpg1252\cocoartf2709
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset178 GeezaPro;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh14140\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 //\'97Refal ALnami\
// 444000628\
\
// Java code for linearly search x in arr[]. If x\
\
// is present then return its location, otherwise\
\
// return -1\
\
class LinearSearch \{\
\
            // This function returns index of element x in arr[]\
\
            static int search(int arr[], int n, int x)\
\
            \{\
\
                        for (int i = 0; i < n; i++) \{\
\
                                // Return the index of the element if the element\
\
                                    // is found\
\
                                    if (arr[i] == x)\
\
                                                return i;\
\
                        \}\
\
 \
\
                        // return -1 if the element is not found\
\
                        return -1;\
\
            \}\
\
 \
\
            public static void main(String[] args)\
\
            \{\
\
                        int[] arr = \{ 3, 4, 1, 7, 5 \};\
\
                        int n = arr.length;\
\
                        int x = 4;\
\
                        int index = search(arr, n, x);\
\
                        if (index == -1)\
\
                          System.out.println("Element is not present in the array");\
\
                        else\
\
                          System.out.println("Element found at position " + index);\
\
            \}\
\
\}\
\
//------------------------------------------------------------------------------------------------------}