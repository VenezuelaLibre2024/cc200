.class public final synthetic Lf4/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh7/g;


# instance fields
.field public final synthetic h:Lf4/g;


# direct methods
.method public synthetic constructor <init>(Lf4/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/e;->h:Lf4/g;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf4/e;->h:Lf4/g;

    check-cast p1, Lf4/o;

    invoke-virtual {v0, p1}, Lf4/g;->n(Lf4/o;)Lf4/o;

    move-result-object p1

    return-object p1
.end method
