.class public final synthetic Ln3/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp3/b$a;


# instance fields
.field public final synthetic a:Ln3/s;


# direct methods
.method public synthetic constructor <init>(Ln3/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/j;->a:Ln3/s;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ln3/j;->a:Ln3/s;

    invoke-static {v0}, Ln3/s;->i(Ln3/s;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
