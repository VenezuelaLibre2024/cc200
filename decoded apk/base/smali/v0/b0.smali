.class public Lv0/b0;
.super Ljava/io/IOException;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv0/b0$a;
    }
.end annotation


# instance fields
.field public h:Lv0/r0;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lv0/b0;->h:Lv0/r0;

    return-void
.end method

.method public static a()Lv0/b0;
    .locals 2

    new-instance v0, Lv0/b0;

    const-string v1, "Protocol message end-group tag did not match expected tag."

    invoke-direct {v0, v1}, Lv0/b0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static b()Lv0/b0;
    .locals 2

    new-instance v0, Lv0/b0;

    const-string v1, "Protocol message contained an invalid tag (zero)."

    invoke-direct {v0, v1}, Lv0/b0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static c()Lv0/b0;
    .locals 2

    new-instance v0, Lv0/b0;

    const-string v1, "Protocol message had invalid UTF-8."

    invoke-direct {v0, v1}, Lv0/b0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static d()Lv0/b0$a;
    .locals 2

    new-instance v0, Lv0/b0$a;

    const-string v1, "Protocol message tag had invalid wire type."

    invoke-direct {v0, v1}, Lv0/b0$a;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static e()Lv0/b0;
    .locals 2

    new-instance v0, Lv0/b0;

    const-string v1, "CodedInputStream encountered a malformed varint."

    invoke-direct {v0, v1}, Lv0/b0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static f()Lv0/b0;
    .locals 2

    new-instance v0, Lv0/b0;

    const-string v1, "CodedInputStream encountered an embedded string or message which claimed to have negative size."

    invoke-direct {v0, v1}, Lv0/b0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static g()Lv0/b0;
    .locals 2

    new-instance v0, Lv0/b0;

    const-string v1, "Failed to parse the message."

    invoke-direct {v0, v1}, Lv0/b0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static h()Lv0/b0;
    .locals 2

    new-instance v0, Lv0/b0;

    const-string v1, "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."

    invoke-direct {v0, v1}, Lv0/b0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static j()Lv0/b0;
    .locals 2

    new-instance v0, Lv0/b0;

    const-string v1, "Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit."

    invoke-direct {v0, v1}, Lv0/b0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static k()Lv0/b0;
    .locals 2

    new-instance v0, Lv0/b0;

    const-string v1, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."

    invoke-direct {v0, v1}, Lv0/b0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public i(Lv0/r0;)Lv0/b0;
    .locals 0

    iput-object p1, p0, Lv0/b0;->h:Lv0/r0;

    return-object p0
.end method
