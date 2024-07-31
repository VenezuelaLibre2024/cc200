.class public final synthetic Lh8/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh8/j$a;


# static fields
.field public static final synthetic a:Lh8/f;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lh8/f;

    invoke-direct {v0}, Lh8/f;-><init>()V

    sput-object v0, Lh8/f;->a:Lh8/f;

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

    invoke-static {p1}, Lh8/j;->f(Landroid/util/JsonReader;)Lg8/f0$e$d$a$b$e;

    move-result-object p1

    return-object p1
.end method
