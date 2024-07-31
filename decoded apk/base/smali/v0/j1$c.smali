.class public Lv0/j1$c;
.super Lv0/j1$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv0/j1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv0/j1<",
        "TK;TV;>.g;"
    }
.end annotation


# instance fields
.field public final synthetic i:Lv0/j1;


# direct methods
.method public constructor <init>(Lv0/j1;)V
    .locals 1

    iput-object p1, p0, Lv0/j1$c;->i:Lv0/j1;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lv0/j1$g;-><init>(Lv0/j1;Lv0/j1$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Lv0/j1;Lv0/j1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lv0/j1$c;-><init>(Lv0/j1;)V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lv0/j1$b;

    iget-object v1, p0, Lv0/j1$c;->i:Lv0/j1;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lv0/j1$b;-><init>(Lv0/j1;Lv0/j1$a;)V

    return-object v0
.end method
