.class public Lwb/b;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ljava/nio/ByteBuffer;)B
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p0

    return p0
.end method

.method public static b(B)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x42

    if-eq p0, v0, :cond_3

    const/16 v0, 0x4d

    if-eq p0, v0, :cond_2

    const/16 v0, 0x58

    if-eq p0, v0, :cond_1

    const/16 v0, 0x64

    if-eq p0, v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown Profile ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "High Profile"

    return-object p0

    :cond_1
    const-string p0, "Extended Profile"

    return-object p0

    :cond_2
    const-string p0, "Main Profile"

    return-object p0

    :cond_3
    const-string p0, "Baseline Profile"

    return-object p0
.end method
