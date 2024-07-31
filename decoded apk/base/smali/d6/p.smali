.class public final synthetic Ld6/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ld6/u;


# direct methods
.method public synthetic constructor <init>(Ld6/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld6/p;->h:Ld6/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ld6/p;->h:Ld6/u;

    invoke-virtual {v0}, Ld6/u;->d()V

    return-void
.end method
