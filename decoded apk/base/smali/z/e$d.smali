.class public final Lz/e$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:I


# direct methods
.method public constructor <init>(Ljava/lang/String;IZLjava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/e$d;->a:Ljava/lang/String;

    iput p2, p0, Lz/e$d;->b:I

    iput-boolean p3, p0, Lz/e$d;->c:Z

    iput-object p4, p0, Lz/e$d;->d:Ljava/lang/String;

    iput p5, p0, Lz/e$d;->e:I

    iput p6, p0, Lz/e$d;->f:I

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lz/e$d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lz/e$d;->f:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lz/e$d;->e:I

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lz/e$d;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lz/e$d;->b:I

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lz/e$d;->c:Z

    return v0
.end method
