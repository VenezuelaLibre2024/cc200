.class public final synthetic Ldf/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/FilenameFilter;


# static fields
.field public static final synthetic a:Ldf/a;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ldf/a;

    invoke-direct {v0}, Ldf/a;-><init>()V

    sput-object v0, Ldf/a;->a:Ldf/a;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p1, p2}, Ldf/b;->a(Ljava/io/File;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
