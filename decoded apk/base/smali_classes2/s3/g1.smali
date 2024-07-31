.class public final synthetic Ls3/g1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh7/u;


# instance fields
.field public final synthetic h:Ls3/i1;


# direct methods
.method public synthetic constructor <init>(Ls3/i1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/g1;->h:Ls3/i1;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ls3/g1;->h:Ls3/i1;

    invoke-static {v0}, Ls3/i1;->f(Ls3/i1;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
