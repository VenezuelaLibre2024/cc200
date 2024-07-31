.class public final synthetic Lp9/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly7/g;


# instance fields
.field public final synthetic a:Lcom/google/firebase/storage/StorageRegistrar;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/storage/StorageRegistrar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp9/q;->a:Lcom/google/firebase/storage/StorageRegistrar;

    return-void
.end method


# virtual methods
.method public final a(Ly7/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp9/q;->a:Lcom/google/firebase/storage/StorageRegistrar;

    invoke-static {v0, p1}, Lcom/google/firebase/storage/StorageRegistrar;->a(Lcom/google/firebase/storage/StorageRegistrar;Ly7/d;)Lp9/g;

    move-result-object p1

    return-object p1
.end method
