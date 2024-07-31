.class public Ljc/b$c;
.super Lkc/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljc/b;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljc/b;


# direct methods
.method public constructor <init>(Ljc/b;)V
    .locals 0

    iput-object p1, p0, Ljc/b$c;->a:Ljc/b;

    invoke-direct {p0}, Lkc/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Ljc/b$c;->a:Ljc/b;

    sget-object v1, Ljc/c;->n:Ljc/c;

    invoke-static {v0, v1}, Ljc/b;->f(Ljc/b;Ljc/c;)V

    iget-object v0, p0, Ljc/b$c;->a:Ljc/b;

    const/16 v1, 0x87

    invoke-static {v0, v1}, Ljc/b;->l(Ljc/b;I)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Ljc/b$c;->a:Ljc/b;

    const/16 v1, 0xf

    invoke-static {v0, v1}, Ljc/b;->l(Ljc/b;I)V

    return-void
.end method
