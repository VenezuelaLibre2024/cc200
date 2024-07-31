.class public final Lr6/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr6/k;


# instance fields
.field public final synthetic a:Lr6/a;


# direct methods
.method public constructor <init>(Lr6/a;)V
    .locals 0

    iput-object p1, p0, Lr6/j;->a:Lr6/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public final b(Lr6/c;)V
    .locals 0

    iget-object p1, p0, Lr6/j;->a:Lr6/a;

    invoke-static {p1}, Lr6/a;->j(Lr6/a;)Lr6/c;

    move-result-object p1

    invoke-interface {p1}, Lr6/c;->onResume()V

    return-void
.end method
