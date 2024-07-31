.class public final synthetic Ln5/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln5/m$h$a;


# instance fields
.field public final synthetic a:Ln5/m;

.field public final synthetic b:Ln5/m$d;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Ln5/m;Ln5/m$d;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln5/l;->a:Ln5/m;

    iput-object p2, p0, Ln5/l;->b:Ln5/m$d;

    iput-boolean p3, p0, Ln5/l;->c:Z

    return-void
.end method


# virtual methods
.method public final a(ILu4/s0;[I)Ljava/util/List;
    .locals 6

    iget-object v0, p0, Ln5/l;->a:Ln5/m;

    iget-object v1, p0, Ln5/l;->b:Ln5/m$d;

    iget-boolean v2, p0, Ln5/l;->c:Z

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Ln5/m;->q(Ln5/m;Ln5/m$d;ZILu4/s0;[I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
