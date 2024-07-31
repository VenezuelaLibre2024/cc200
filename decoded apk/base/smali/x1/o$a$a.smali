.class public Lx1/o$a$a;
.super Lx1/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx1/o$a;->onPreDraw()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lu/a;

.field public final synthetic b:Lx1/o$a;


# direct methods
.method public constructor <init>(Lx1/o$a;Lu/a;)V
    .locals 0

    iput-object p1, p0, Lx1/o$a$a;->b:Lx1/o$a;

    iput-object p2, p0, Lx1/o$a$a;->a:Lu/a;

    invoke-direct {p0}, Lx1/n;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lx1/m;)V
    .locals 2

    iget-object v0, p0, Lx1/o$a$a;->a:Lu/a;

    iget-object v1, p0, Lx1/o$a$a;->b:Lx1/o$a;

    iget-object v1, v1, Lx1/o$a;->i:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Lu/g;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, p0}, Lx1/m;->T(Lx1/m$f;)Lx1/m;

    return-void
.end method
