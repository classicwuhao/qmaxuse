PREFIX=/System/Library/Frameworks/Python.framework/Versions/2.7
CC=gcc
CXX=g++
CXXFLAGS= -D_MP_INTERNAL -DNDEBUG -D_EXTERNAL_RELEASE  -std=c++11 -fvisibility=hidden -c -mfpmath=sse -msse -msse2 -O3 -Wno-unknown-pragmas -Wno-overloaded-virtual -Wno-unused-value -fPIC
CFLAGS= -D_MP_INTERNAL -DNDEBUG -D_EXTERNAL_RELEASE   -fvisibility=hidden -c -mfpmath=sse -msse -msse2 -O3 -Wno-unknown-pragmas -Wno-overloaded-virtual -Wno-unused-value -fPIC
EXAMP_DEBUG_FLAG=
CXX_OUT_FLAG=-o 
C_OUT_FLAG=-o 
OBJ_EXT=.o
LIB_EXT=.a
AR=ar
AR_FLAGS=rcs
AR_OUTFLAG=
EXE_EXT=
LINK=g++
LINK_FLAGS=
LINK_OUT_FLAG=-o 
LINK_EXTRA_FLAGS=-lpthread 
SO_EXT=.dylib
SLINK=g++
SLINK_FLAGS=-dynamiclib
SLINK_EXTRA_FLAGS=-lpthread 
SLINK_OUT_FLAG=-o 
OS_DEFINES=
