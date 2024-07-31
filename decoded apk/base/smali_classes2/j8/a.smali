.class public final synthetic Lj8/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/FilenameFilter;


# static fields
.field public static final synthetic a:Lj8/a;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lj8/a;

    invoke-direct {v0}, Lj8/a;-><init>()V

    sput-object v0, Lj8/a;->a:Lj8/a;

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

    invoke-static {p1, p2}, Lj8/e;->b(Ljava/io/File;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
