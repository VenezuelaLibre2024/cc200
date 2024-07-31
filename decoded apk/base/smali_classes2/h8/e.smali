.class public final synthetic Lh8/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh8/j$a;


# static fields
.field public static final synthetic a:Lh8/e;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lh8/e;

    invoke-direct {v0}, Lh8/e;-><init>()V

    sput-object v0, Lh8/e;->a:Lh8/e;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/util/JsonReader;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lh8/j;->e(Landroid/util/JsonReader;)Lg8/f0$e$d$a$c;

    move-result-object p1

    return-object p1
.end method
