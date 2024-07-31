.class public final synthetic Ln5/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln5/m$h$a;


# instance fields
.field public final synthetic a:Ln5/m$d;

.field public final synthetic b:[I


# direct methods
.method public synthetic constructor <init>(Ln5/m$d;[I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln5/k;->a:Ln5/m$d;

    iput-object p2, p0, Ln5/k;->b:[I

    return-void
.end method


# virtual methods
.method public final a(ILu4/s0;[I)Ljava/util/List;
    .locals 2

    iget-object v0, p0, Ln5/k;->a:Ln5/m$d;

    iget-object v1, p0, Ln5/k;->b:[I

    invoke-static {v0, v1, p1, p2, p3}, Ln5/m;->o(Ln5/m$d;[IILu4/s0;[I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
