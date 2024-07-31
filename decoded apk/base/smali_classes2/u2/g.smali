.class public final synthetic Lu2/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lv2/a;


# instance fields
.field public final synthetic a:Lu2/k;

.field public final synthetic b:[Z

.field public final synthetic c:Lw2/o;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public synthetic constructor <init>(Lu2/k;[ZLw2/o;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/g;->a:Lu2/k;

    iput-object p2, p0, Lu2/g;->b:[Z

    iput-object p3, p0, Lu2/g;->c:Lw2/o;

    iput-object p4, p0, Lu2/g;->d:Ljava/lang/String;

    iput-object p5, p0, Lu2/g;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method


# virtual methods
.method public final a(Lv2/b;)V
    .locals 6

    iget-object v0, p0, Lu2/g;->a:Lu2/k;

    iget-object v1, p0, Lu2/g;->b:[Z

    iget-object v2, p0, Lu2/g;->c:Lw2/o;

    iget-object v3, p0, Lu2/g;->d:Ljava/lang/String;

    iget-object v4, p0, Lu2/g;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lu2/k;->a(Lu2/k;[ZLw2/o;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Lv2/b;)V

    return-void
.end method
