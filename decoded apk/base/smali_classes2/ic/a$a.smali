.class public Lic/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lkc/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lic/a;->b(Lio/flutter/plugin/common/BinaryMessenger;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lic/a;


# direct methods
.method public constructor <init>(Lic/a;)V
    .locals 0

    iput-object p1, p0, Lic/a$a;->a:Lic/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "record complete"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lic/a$a;->a:Lic/a;

    const/16 v1, 0xf

    const-string v2, "IO_EXCEPTION"

    invoke-static {v0, v1, v2}, Lic/a;->a(Lic/a;ILjava/lang/String;)V

    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lic/a$a;->a:Lic/a;

    const/4 v1, 0x5

    const-string v2, "FILE NOT FOUNT"

    invoke-static {v0, v1, v2}, Lic/a;->a(Lic/a;ILjava/lang/String;)V

    return-void
.end method

.method public d(Ljc/c;)V
    .locals 0

    return-void
.end method

.method public e()V
    .locals 3

    iget-object v0, p0, Lic/a$a;->a:Lic/a;

    const/16 v1, 0x14

    const-string v2, "RECORD_HAS_USED"

    invoke-static {v0, v1, v2}, Lic/a;->a(Lic/a;ILjava/lang/String;)V

    return-void
.end method

.method public f()V
    .locals 3

    iget-object v0, p0, Lic/a$a;->a:Lic/a;

    const/16 v1, 0xa

    const-string v2, "mic permission error"

    invoke-static {v0, v1, v2}, Lic/a;->a(Lic/a;ILjava/lang/String;)V

    return-void
.end method
