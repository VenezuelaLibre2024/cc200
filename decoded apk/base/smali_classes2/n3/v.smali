.class public final synthetic Ln3/v;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp3/b$a;


# instance fields
.field public final synthetic a:Ln3/w;


# direct methods
.method public synthetic constructor <init>(Ln3/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/v;->a:Ln3/w;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ln3/v;->a:Ln3/w;

    invoke-static {v0}, Ln3/w;->a(Ln3/w;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
