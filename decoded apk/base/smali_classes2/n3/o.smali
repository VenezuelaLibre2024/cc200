.class public final synthetic Ln3/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp3/b$a;


# instance fields
.field public final synthetic a:Ln3/s;

.field public final synthetic b:Ljava/lang/Iterable;


# direct methods
.method public synthetic constructor <init>(Ln3/s;Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/o;->a:Ln3/s;

    iput-object p2, p0, Ln3/o;->b:Ljava/lang/Iterable;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ln3/o;->a:Ln3/s;

    iget-object v1, p0, Ln3/o;->b:Ljava/lang/Iterable;

    invoke-static {v0, v1}, Ln3/s;->g(Ln3/s;Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
