.class public final synthetic Lj4/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic h:Lj4/v$g;


# direct methods
.method public synthetic constructor <init>(Lj4/v$g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj4/u;->h:Lj4/v$g;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lj4/u;->h:Lj4/v$g;

    invoke-static {v0, p1, p2}, Lj4/v;->d(Lj4/v$g;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
