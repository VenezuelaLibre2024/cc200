.class public final Ll7/a$k;
.super Ll7/a$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "k"
.end annotation


# static fields
.field public static final a:Lsun/misc/Unsafe;

.field public static final b:J

.field public static final c:J

.field public static final d:J

.field public static final e:J

.field public static final f:J


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const-class v0, Ll7/a$l;

    :try_start_0
    invoke-static {}, Lsun/misc/Unsafe;->getUnsafe()Lsun/misc/Unsafe;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :try_start_1
    new-instance v1, Ll7/a$k$a;

    invoke-direct {v1}, Ll7/a$k$a;-><init>()V

    invoke-static {v1}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsun/misc/Unsafe;
    :try_end_1
    .catch Ljava/security/PrivilegedActionException; {:try_start_1 .. :try_end_1} :catch_3

    :goto_0
    :try_start_2
    const-class v2, Ll7/a;

    const-string v3, "j"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v1, v3}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v3

    sput-wide v3, Ll7/a$k;->c:J

    const-string v3, "i"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v1, v3}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v3

    sput-wide v3, Ll7/a$k;->b:J

    const-string v3, "h"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v2

    sput-wide v2, Ll7/a$k;->d:J

    const-string v2, "a"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v2

    sput-wide v2, Ll7/a$k;->e:J

    const-string v2, "b"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v1, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v2

    sput-wide v2, Ll7/a$k;->f:J

    sput-object v1, Ll7/a$k;->a:Lsun/misc/Unsafe;
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    return-void

    :catch_1
    move-exception v0

    throw v0

    :catch_2
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_3
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/security/PrivilegedActionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    const-string v2, "Could not initialize intrinsics"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ll7/a$b;-><init>(Ll7/a$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Ll7/a$a;)V
    .locals 0

    invoke-direct {p0}, Ll7/a$k;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ll7/a;Ll7/a$e;Ll7/a$e;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll7/a<",
            "*>;",
            "Ll7/a$e;",
            "Ll7/a$e;",
            ")Z"
        }
    .end annotation

    sget-object v0, Ll7/a$k;->a:Lsun/misc/Unsafe;

    sget-wide v2, Ll7/a$k;->b:J

    move-object v1, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Ll7/b;->a(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public b(Ll7/a;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll7/a<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    sget-object v0, Ll7/a$k;->a:Lsun/misc/Unsafe;

    sget-wide v2, Ll7/a$k;->d:J

    move-object v1, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Ll7/b;->a(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public c(Ll7/a;Ll7/a$l;Ll7/a$l;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll7/a<",
            "*>;",
            "Ll7/a$l;",
            "Ll7/a$l;",
            ")Z"
        }
    .end annotation

    sget-object v0, Ll7/a$k;->a:Lsun/misc/Unsafe;

    sget-wide v2, Ll7/a$k;->c:J

    move-object v1, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Ll7/b;->a(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public d(Ll7/a;Ll7/a$e;)Ll7/a$e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll7/a<",
            "*>;",
            "Ll7/a$e;",
            ")",
            "Ll7/a$e;"
        }
    .end annotation

    :cond_0
    invoke-static {p1}, Ll7/a;->h(Ll7/a;)Ll7/a$e;

    move-result-object v0

    if-ne p2, v0, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p0, p1, v0, p2}, Ll7/a$k;->a(Ll7/a;Ll7/a$e;Ll7/a$e;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0
.end method

.method public e(Ll7/a;Ll7/a$l;)Ll7/a$l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll7/a<",
            "*>;",
            "Ll7/a$l;",
            ")",
            "Ll7/a$l;"
        }
    .end annotation

    :cond_0
    invoke-static {p1}, Ll7/a;->j(Ll7/a;)Ll7/a$l;

    move-result-object v0

    if-ne p2, v0, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p0, p1, v0, p2}, Ll7/a$k;->c(Ll7/a;Ll7/a$l;Ll7/a$l;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0
.end method

.method public f(Ll7/a$l;Ll7/a$l;)V
    .locals 3

    sget-object v0, Ll7/a$k;->a:Lsun/misc/Unsafe;

    sget-wide v1, Ll7/a$k;->f:J

    invoke-virtual {v0, p1, v1, v2, p2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method public g(Ll7/a$l;Ljava/lang/Thread;)V
    .locals 3

    sget-object v0, Ll7/a$k;->a:Lsun/misc/Unsafe;

    sget-wide v1, Ll7/a$k;->e:J

    invoke-virtual {v0, p1, v1, v2, p2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method
