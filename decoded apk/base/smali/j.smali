.class public final Lj;
.super Lio/flutter/plugin/common/StandardMessageCodec;
.source ""


# static fields
.field public static final a:Lj;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj;

    invoke-direct {v0}, Lj;-><init>()V

    sput-object v0, Lj;->a:Lj;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugin/common/StandardMessageCodec;-><init>()V

    return-void
.end method


# virtual methods
.method public readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 2

    const-string v0, "buffer"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/16 v1, -0x80

    if-ne p1, v1, :cond_2

    invoke-virtual {p0, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_0

    check-cast p1, Ljava/util/List;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_1

    sget-object p2, Lb;->b:Lb$a;

    invoke-virtual {p2, p1}, Lb$a;->a(Ljava/util/List;)Lb;

    move-result-object v0

    :cond_1
    return-object v0

    :cond_2
    const/16 v1, -0x7f

    if-ne p1, v1, :cond_5

    invoke-virtual {p0, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_3

    check-cast p1, Ljava/util/List;

    goto :goto_1

    :cond_3
    move-object p1, v0

    :goto_1
    if-eqz p1, :cond_4

    sget-object p2, Lf;->b:Lf$a;

    invoke-virtual {p2, p1}, Lf$a;->a(Ljava/util/List;)Lf;

    move-result-object v0

    :cond_4
    return-object v0

    :cond_5
    invoke-super {p0, p1, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "stream"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lb;

    if-eqz v0, :cond_0

    const/16 v0, 0x80

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lb;

    invoke-virtual {p2}, Lb;->a()Ljava/util/List;

    move-result-object p2

    :goto_0
    invoke-virtual {p0, p1, p2}, Lj;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    instance-of v0, p2, Lf;

    if-eqz v0, :cond_1

    const/16 v0, 0x81

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lf;

    invoke-virtual {p2}, Lf;->b()Ljava/util/List;

    move-result-object p2

    goto :goto_0

    :cond_1
    invoke-super {p0, p1, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method
