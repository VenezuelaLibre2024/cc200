.class public final Lf4/b$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final a:[Lf4/p;

.field public b:Ls3/m1;

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array p1, p1, [Lf4/p;

    iput-object p1, p0, Lf4/b$d;->a:[Lf4/p;

    const/4 p1, 0x0

    iput p1, p0, Lf4/b$d;->d:I

    return-void
.end method
