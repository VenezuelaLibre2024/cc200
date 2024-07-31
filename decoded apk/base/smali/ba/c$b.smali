.class public Lba/c$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lga/a$a;
.implements Laa/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lba/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Laa/b;",
        ">",
        "Ljava/lang/Object;",
        "Lga/a$a;",
        "Laa/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Laa/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final b:Lea/b;

.field public final c:Lcom/google/android/gms/maps/model/LatLng;

.field public d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Laa/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba/c$b;->a:Laa/b;

    invoke-interface {p1}, Laa/b;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    iput-object v0, p0, Lba/c$b;->c:Lcom/google/android/gms/maps/model/LatLng;

    invoke-static {}, Lba/c;->j()Lfa/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lfa/b;->b(Lcom/google/android/gms/maps/model/LatLng;)Lfa/a;

    move-result-object v0

    iput-object v0, p0, Lba/c$b;->b:Lea/b;

    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lba/c$b;->d:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Laa/b;Lba/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lba/c$b;-><init>(Laa/b;)V

    return-void
.end method

.method public static synthetic d(Lba/c$b;)Laa/b;
    .locals 0

    iget-object p0, p0, Lba/c$b;->a:Laa/b;

    return-object p0
.end method


# virtual methods
.method public a()Lea/b;
    .locals 1

    iget-object v0, p0, Lba/c$b;->b:Lea/b;

    return-object v0
.end method

.method public bridge synthetic b()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Lba/c$b;->e()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public e()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lba/c$b;->d:Ljava/util/Set;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lba/c$b;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lba/c$b;

    iget-object p1, p1, Lba/c$b;->a:Laa/b;

    iget-object v0, p0, Lba/c$b;->a:Laa/b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getPosition()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    iget-object v0, p0, Lba/c$b;->c:Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lba/c$b;->a:Laa/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
