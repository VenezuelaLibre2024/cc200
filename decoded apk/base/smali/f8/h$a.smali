.class public Lf8/h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf8/g$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf8/h;->g()Lf8/h$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:[B

.field public final synthetic b:[I

.field public final synthetic c:Lf8/h;


# direct methods
.method public constructor <init>(Lf8/h;[B[I)V
    .locals 0

    iput-object p1, p0, Lf8/h$a;->c:Lf8/h;

    iput-object p2, p0, Lf8/h$a;->a:[B

    iput-object p3, p0, Lf8/h$a;->b:[I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;I)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lf8/h$a;->a:[B

    iget-object v1, p0, Lf8/h$a;->b:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {p1, v0, v1, p2}, Ljava/io/InputStream;->read([BII)I

    iget-object v0, p0, Lf8/h$a;->b:[I

    aget v1, v0, v2

    add-int/2addr v1, p2

    aput v1, v0, v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    throw p2
.end method
