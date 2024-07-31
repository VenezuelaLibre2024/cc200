.class public final Lr6/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr6/k;


# instance fields
.field public final synthetic a:Landroid/os/Bundle;

.field public final synthetic b:Lr6/a;


# direct methods
.method public constructor <init>(Lr6/a;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lr6/g;->b:Lr6/a;

    iput-object p2, p0, Lr6/g;->a:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final b(Lr6/c;)V
    .locals 1

    iget-object p1, p0, Lr6/g;->b:Lr6/a;

    invoke-static {p1}, Lr6/a;->j(Lr6/a;)Lr6/c;

    move-result-object p1

    iget-object v0, p0, Lr6/g;->a:Landroid/os/Bundle;

    invoke-interface {p1, v0}, Lr6/c;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method
