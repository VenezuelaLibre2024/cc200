.class public Ljc/a$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljc/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public a:[S

.field public b:I

.field public final synthetic c:Ljc/a;


# direct methods
.method public constructor <init>(Ljc/a;[SI)V
    .locals 0

    iput-object p1, p0, Ljc/a$b;->c:Ljc/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2}, [S->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [S

    iput-object p1, p0, Ljc/a$b;->a:[S

    iput p3, p0, Ljc/a$b;->b:I

    return-void
.end method


# virtual methods
.method public a()[S
    .locals 1

    iget-object v0, p0, Ljc/a$b;->a:[S

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Ljc/a$b;->b:I

    return v0
.end method
