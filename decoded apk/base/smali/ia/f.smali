.class public final Lia/f;
.super Lia/m;
.source ""


# static fields
.field public static final j:Lia/f;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lia/f;

    invoke-direct {v0}, Lia/f;-><init>()V

    sput-object v0, Lia/f;->j:Lia/f;

    sget-object v1, Lia/m;->i:[Ljava/lang/StackTraceElement;

    invoke-virtual {v0, v1}, Ljava/lang/Exception;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lia/m;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lia/m;-><init>(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static a()Lia/f;
    .locals 1

    sget-boolean v0, Lia/m;->h:Z

    if-eqz v0, :cond_0

    new-instance v0, Lia/f;

    invoke-direct {v0}, Lia/f;-><init>()V

    goto :goto_0

    :cond_0
    sget-object v0, Lia/f;->j:Lia/f;

    :goto_0
    return-object v0
.end method

.method public static b(Ljava/lang/Throwable;)Lia/f;
    .locals 1

    sget-boolean v0, Lia/m;->h:Z

    if-eqz v0, :cond_0

    new-instance v0, Lia/f;

    invoke-direct {v0, p0}, Lia/f;-><init>(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lia/f;->j:Lia/f;

    :goto_0
    return-object v0
.end method
