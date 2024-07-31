.class public final Lrb/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrb/b$b;,
        Lrb/b$a;
    }
.end annotation


# static fields
.field public static final c:Lrb/b$a;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrb/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrb/b$a;-><init>(Ltd/g;)V

    sput-object v0, Lrb/b;->c:Lrb/b$a;

    return-void
.end method

.method public constructor <init>(ILrb/b$b;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lrb/b;->b:Ljava/lang/String;

    sget-object v0, Lrb/c;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    invoke-static {p1, p3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_0
    new-instance p1, Lgd/i;

    invoke-direct {p1}, Lgd/i;-><init>()V

    throw p1

    :cond_1
    invoke-static {p1, p3}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result p1

    :goto_0
    iput p1, p0, Lrb/b;->a:I

    invoke-static {p1, p3}, Lob/c;->c(ILjava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(ILrb/b$b;Ljava/lang/String;Ltd/g;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lrb/b;-><init>(ILrb/b$b;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lrb/b;->a:I

    return v0
.end method
