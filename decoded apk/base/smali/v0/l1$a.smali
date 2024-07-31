.class public final Lv0/l1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lv0/l1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv0/l1;->a(Lv0/h;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lv0/h;


# direct methods
.method public constructor <init>(Lv0/h;)V
    .locals 0

    iput-object p1, p0, Lv0/l1$a;->a:Lv0/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)B
    .locals 1

    iget-object v0, p0, Lv0/l1$a;->a:Lv0/h;

    invoke-virtual {v0, p1}, Lv0/h;->b(I)B

    move-result p1

    return p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lv0/l1$a;->a:Lv0/h;

    invoke-virtual {v0}, Lv0/h;->size()I

    move-result v0

    return v0
.end method
