.class public final Lcom/google/gson/internal/k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/gson/internal/k$a;
    }
.end annotation


# direct methods
.method public static a(Ly9/a;)Lcom/google/gson/j;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Ly9/a;->r0()Ly9/b;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ly9/d; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v0, 0x0

    :try_start_1
    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->U:Lcom/google/gson/TypeAdapter;

    invoke-virtual {v1, p0}, Lcom/google/gson/TypeAdapter;->read(Ly9/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/gson/j;
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ly9/d; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    new-instance v0, Lcom/google/gson/r;

    invoke-direct {v0, p0}, Lcom/google/gson/r;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception p0

    new-instance v0, Lcom/google/gson/k;

    invoke-direct {v0, p0}, Lcom/google/gson/k;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_3
    move-exception p0

    new-instance v0, Lcom/google/gson/r;

    invoke-direct {v0, p0}, Lcom/google/gson/r;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_4
    move-exception p0

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_0

    sget-object p0, Lcom/google/gson/l;->a:Lcom/google/gson/l;

    return-object p0

    :cond_0
    new-instance v0, Lcom/google/gson/r;

    invoke-direct {v0, p0}, Lcom/google/gson/r;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static b(Lcom/google/gson/j;Ly9/c;)V
    .locals 1

    sget-object v0, Lcom/google/gson/internal/bind/TypeAdapters;->U:Lcom/google/gson/TypeAdapter;

    invoke-virtual {v0, p1, p0}, Lcom/google/gson/TypeAdapter;->write(Ly9/c;Ljava/lang/Object;)V

    return-void
.end method

.method public static c(Ljava/lang/Appendable;)Ljava/io/Writer;
    .locals 1

    instance-of v0, p0, Ljava/io/Writer;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/io/Writer;

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/gson/internal/k$a;

    invoke-direct {v0, p0}, Lcom/google/gson/internal/k$a;-><init>(Ljava/lang/Appendable;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
