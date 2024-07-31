.class public Lv0/h$a;
.super Lv0/h$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv0/h;->o()Lv0/h$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public h:I

.field public final i:I

.field public final synthetic j:Lv0/h;


# direct methods
.method public constructor <init>(Lv0/h;)V
    .locals 1

    iput-object p1, p0, Lv0/h$a;->j:Lv0/h;

    invoke-direct {p0}, Lv0/h$c;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lv0/h$a;->h:I

    invoke-virtual {p1}, Lv0/h;->size()I

    move-result p1

    iput p1, p0, Lv0/h$a;->i:I

    return-void
.end method


# virtual methods
.method public b()B
    .locals 2

    iget v0, p0, Lv0/h$a;->h:I

    iget v1, p0, Lv0/h$a;->i:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lv0/h$a;->h:I

    iget-object v1, p0, Lv0/h$a;->j:Lv0/h;

    invoke-virtual {v1, v0}, Lv0/h;->m(I)B

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, Lv0/h$a;->h:I

    iget v1, p0, Lv0/h$a;->i:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
