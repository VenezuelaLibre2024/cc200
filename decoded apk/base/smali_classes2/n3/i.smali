.class public final synthetic Ln3/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp3/b$a;


# instance fields
.field public final synthetic a:Lo3/d;


# direct methods
.method public synthetic constructor <init>(Lo3/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/i;->a:Lo3/d;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ln3/i;->a:Lo3/d;

    invoke-interface {v0}, Lo3/d;->h()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
