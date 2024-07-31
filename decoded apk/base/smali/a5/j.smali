.class public final La5/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo5/g0$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La5/j$b;,
        La5/j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo5/g0$a<",
        "La5/i;",
        ">;"
    }
.end annotation


# static fields
.field public static final A:Ljava/util/regex/Pattern;

.field public static final B:Ljava/util/regex/Pattern;

.field public static final C:Ljava/util/regex/Pattern;

.field public static final D:Ljava/util/regex/Pattern;

.field public static final E:Ljava/util/regex/Pattern;

.field public static final F:Ljava/util/regex/Pattern;

.field public static final G:Ljava/util/regex/Pattern;

.field public static final H:Ljava/util/regex/Pattern;

.field public static final I:Ljava/util/regex/Pattern;

.field public static final J:Ljava/util/regex/Pattern;

.field public static final K:Ljava/util/regex/Pattern;

.field public static final L:Ljava/util/regex/Pattern;

.field public static final M:Ljava/util/regex/Pattern;

.field public static final N:Ljava/util/regex/Pattern;

.field public static final O:Ljava/util/regex/Pattern;

.field public static final P:Ljava/util/regex/Pattern;

.field public static final Q:Ljava/util/regex/Pattern;

.field public static final R:Ljava/util/regex/Pattern;

.field public static final S:Ljava/util/regex/Pattern;

.field public static final T:Ljava/util/regex/Pattern;

.field public static final U:Ljava/util/regex/Pattern;

.field public static final V:Ljava/util/regex/Pattern;

.field public static final W:Ljava/util/regex/Pattern;

.field public static final X:Ljava/util/regex/Pattern;

.field public static final Y:Ljava/util/regex/Pattern;

.field public static final Z:Ljava/util/regex/Pattern;

.field public static final a0:Ljava/util/regex/Pattern;

.field public static final b0:Ljava/util/regex/Pattern;

.field public static final c:Ljava/util/regex/Pattern;

.field public static final d:Ljava/util/regex/Pattern;

.field public static final e:Ljava/util/regex/Pattern;

.field public static final f:Ljava/util/regex/Pattern;

.field public static final g:Ljava/util/regex/Pattern;

.field public static final h:Ljava/util/regex/Pattern;

.field public static final i:Ljava/util/regex/Pattern;

.field public static final j:Ljava/util/regex/Pattern;

.field public static final k:Ljava/util/regex/Pattern;

.field public static final l:Ljava/util/regex/Pattern;

.field public static final m:Ljava/util/regex/Pattern;

.field public static final n:Ljava/util/regex/Pattern;

.field public static final o:Ljava/util/regex/Pattern;

.field public static final p:Ljava/util/regex/Pattern;

.field public static final q:Ljava/util/regex/Pattern;

.field public static final r:Ljava/util/regex/Pattern;

.field public static final s:Ljava/util/regex/Pattern;

.field public static final t:Ljava/util/regex/Pattern;

.field public static final u:Ljava/util/regex/Pattern;

.field public static final v:Ljava/util/regex/Pattern;

.field public static final w:Ljava/util/regex/Pattern;

.field public static final x:Ljava/util/regex/Pattern;

.field public static final y:Ljava/util/regex/Pattern;

.field public static final z:Ljava/util/regex/Pattern;


# instance fields
.field public final a:La5/h;

.field public final b:La5/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "AVERAGE-BANDWIDTH=(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->c:Ljava/util/regex/Pattern;

    const-string v0, "VIDEO=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->d:Ljava/util/regex/Pattern;

    const-string v0, "AUDIO=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->e:Ljava/util/regex/Pattern;

    const-string v0, "SUBTITLES=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->f:Ljava/util/regex/Pattern;

    const-string v0, "CLOSED-CAPTIONS=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->g:Ljava/util/regex/Pattern;

    const-string v0, "[^-]BANDWIDTH=(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->h:Ljava/util/regex/Pattern;

    const-string v0, "CHANNELS=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->i:Ljava/util/regex/Pattern;

    const-string v0, "CODECS=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->j:Ljava/util/regex/Pattern;

    const-string v0, "RESOLUTION=(\\d+x\\d+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->k:Ljava/util/regex/Pattern;

    const-string v0, "FRAME-RATE=([\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->l:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-TARGETDURATION:(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->m:Ljava/util/regex/Pattern;

    const-string v0, "DURATION=([\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->n:Ljava/util/regex/Pattern;

    const-string v0, "PART-TARGET=([\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->o:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-VERSION:(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->p:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-PLAYLIST-TYPE:(.+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->q:Ljava/util/regex/Pattern;

    const-string v0, "CAN-SKIP-UNTIL=([\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->r:Ljava/util/regex/Pattern;

    const-string v0, "CAN-SKIP-DATERANGES"

    invoke-static {v0}, La5/j;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->s:Ljava/util/regex/Pattern;

    const-string v0, "SKIPPED-SEGMENTS=(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->t:Ljava/util/regex/Pattern;

    const-string v0, "[:|,]HOLD-BACK=([\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->u:Ljava/util/regex/Pattern;

    const-string v0, "PART-HOLD-BACK=([\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->v:Ljava/util/regex/Pattern;

    const-string v0, "CAN-BLOCK-RELOAD"

    invoke-static {v0}, La5/j;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->w:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->x:Ljava/util/regex/Pattern;

    const-string v0, "#EXTINF:([\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->y:Ljava/util/regex/Pattern;

    const-string v0, "#EXTINF:[\\d\\.]+\\b,(.+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->z:Ljava/util/regex/Pattern;

    const-string v0, "LAST-MSN=(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->A:Ljava/util/regex/Pattern;

    const-string v0, "LAST-PART=(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->B:Ljava/util/regex/Pattern;

    const-string v0, "TIME-OFFSET=(-?[\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->C:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->D:Ljava/util/regex/Pattern;

    const-string v0, "BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->E:Ljava/util/regex/Pattern;

    const-string v0, "BYTERANGE-START=(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->F:Ljava/util/regex/Pattern;

    const-string v0, "BYTERANGE-LENGTH=(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->G:Ljava/util/regex/Pattern;

    const-string v0, "METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->H:Ljava/util/regex/Pattern;

    const-string v0, "KEYFORMAT=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->I:Ljava/util/regex/Pattern;

    const-string v0, "KEYFORMATVERSIONS=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->J:Ljava/util/regex/Pattern;

    const-string v0, "URI=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->K:Ljava/util/regex/Pattern;

    const-string v0, "IV=([^,.*]+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->L:Ljava/util/regex/Pattern;

    const-string v0, "TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->M:Ljava/util/regex/Pattern;

    const-string v0, "TYPE=(PART|MAP)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->N:Ljava/util/regex/Pattern;

    const-string v0, "LANGUAGE=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->O:Ljava/util/regex/Pattern;

    const-string v0, "NAME=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->P:Ljava/util/regex/Pattern;

    const-string v0, "GROUP-ID=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->Q:Ljava/util/regex/Pattern;

    const-string v0, "CHARACTERISTICS=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->R:Ljava/util/regex/Pattern;

    const-string v0, "INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->S:Ljava/util/regex/Pattern;

    const-string v0, "AUTOSELECT"

    invoke-static {v0}, La5/j;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->T:Ljava/util/regex/Pattern;

    const-string v0, "DEFAULT"

    invoke-static {v0}, La5/j;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->U:Ljava/util/regex/Pattern;

    const-string v0, "FORCED"

    invoke-static {v0}, La5/j;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->V:Ljava/util/regex/Pattern;

    const-string v0, "INDEPENDENT"

    invoke-static {v0}, La5/j;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->W:Ljava/util/regex/Pattern;

    const-string v0, "GAP"

    invoke-static {v0}, La5/j;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->X:Ljava/util/regex/Pattern;

    const-string v0, "PRECISE"

    invoke-static {v0}, La5/j;->c(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->Y:Ljava/util/regex/Pattern;

    const-string v0, "VALUE=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->Z:Ljava/util/regex/Pattern;

    const-string v0, "IMPORT=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->a0:Ljava/util/regex/Pattern;

    const-string v0, "\\{\\$([a-zA-Z0-9\\-_]+)\\}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La5/j;->b0:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    sget-object v0, La5/h;->n:La5/h;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, La5/j;-><init>(La5/h;La5/g;)V

    return-void
.end method

.method public constructor <init>(La5/h;La5/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La5/j;->a:La5/h;

    iput-object p2, p0, La5/j;->b:La5/g;

    return-void
.end method

.method public static A(Ljava/lang/String;Ljava/util/regex/Pattern;)J
    .locals 2

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {p0, p1, v0}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/math/BigDecimal;

    invoke-direct {p1, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    new-instance p0, Ljava/math/BigDecimal;

    const-wide/32 v0, 0xf4240

    invoke-direct {p0, v0, v1}, Ljava/math/BigDecimal;-><init>(J)V

    invoke-virtual {p1, p0}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p0

    invoke-virtual {p0}, Ljava/math/BigDecimal;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method public static B(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    sget-object v0, La5/j;->b0:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/util/regex/Matcher;->quoteReplacement(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ljava/util/regex/Matcher;->appendReplacement(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->appendTail(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static C(Ljava/io/BufferedReader;ZI)I
    .locals 1

    :goto_0
    const/4 v0, -0x1

    if-eq p2, v0, :cond_1

    invoke-static {p2}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    invoke-static {p2}, Lp5/n0;->u0(I)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    move-result p2

    goto :goto_0

    :cond_1
    return p2
.end method

.method public static b(Ljava/io/BufferedReader;)Z
    .locals 5

    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0xef

    if-ne v0, v2, :cond_2

    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    move-result v0

    const/16 v2, 0xbb

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    move-result v0

    const/16 v2, 0xbf

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    move-result v0

    goto :goto_1

    :cond_1
    :goto_0
    return v1

    :cond_2
    :goto_1
    const/4 v2, 0x1

    invoke-static {p0, v2, v0}, La5/j;->C(Ljava/io/BufferedReader;ZI)I

    move-result v0

    const/4 v2, 0x7

    move v3, v1

    :goto_2
    if-ge v3, v2, :cond_4

    const-string v4, "#EXTM3U"

    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v0, v4, :cond_3

    return v1

    :cond_3
    invoke-virtual {p0}, Ljava/io/BufferedReader;->read()I

    move-result v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_4
    invoke-static {p0, v1, v0}, La5/j;->C(Ljava/io/BufferedReader;ZI)I

    move-result p0

    invoke-static {p0}, Lp5/n0;->u0(I)Z

    move-result p0

    return p0
.end method

.method public static c(Ljava/lang/String;)Ljava/util/regex/Pattern;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "=("

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "NO"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "|"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "YES"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ljava/lang/String;[Lw3/m$b;)Lw3/m;
    .locals 4

    array-length v0, p1

    new-array v0, v0, [Lw3/m$b;

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    aget-object v2, p1, v1

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lw3/m$b;->b([B)Lw3/m$b;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lw3/m;

    invoke-direct {p1, p0, v0}, Lw3/m;-><init>(Ljava/lang/String;[Lw3/m$b;)V

    return-object p1
.end method

.method public static e(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-nez p2, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz p3, :cond_1

    return-object p3

    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ljava/util/ArrayList;Ljava/lang/String;)La5/h$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "La5/h$b;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "La5/h$b;"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La5/h$b;

    iget-object v2, v1, La5/h$b;->d:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static g(Ljava/util/ArrayList;Ljava/lang/String;)La5/h$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "La5/h$b;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "La5/h$b;"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La5/h$b;

    iget-object v2, v1, La5/h$b;->e:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static h(Ljava/util/ArrayList;Ljava/lang/String;)La5/h$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "La5/h$b;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "La5/h$b;"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La5/h$b;

    iget-object v2, v1, La5/h$b;->c:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static j(Ljava/lang/String;Ljava/util/regex/Pattern;)D
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {p0, p1, v0}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide p0

    return-wide p0
.end method

.method public static k(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lw3/m$b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lw3/m$b;"
        }
    .end annotation

    sget-object v0, La5/j;->J:Ljava/util/regex/Pattern;

    const-string v1, "1"

    invoke-static {p0, v0, v1, p2}, La5/j;->u(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    const/16 v4, 0x2c

    const-string v5, "video/mp4"

    if-eqz v2, :cond_0

    sget-object p1, La5/j;->K:Ljava/util/regex/Pattern;

    invoke-static {p0, p1, p2}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Lw3/m$b;

    sget-object p2, Ls3/i;->d:Ljava/util/UUID;

    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    invoke-direct {p1, p2, v5, p0}, Lw3/m$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    return-object p1

    :cond_0
    const-string v2, "com.widevine"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance p1, Lw3/m$b;

    sget-object p2, Ls3/i;->d:Ljava/util/UUID;

    invoke-static {p0}, Lp5/n0;->l0(Ljava/lang/String;)[B

    move-result-object p0

    const-string v0, "hls"

    invoke-direct {p1, p2, v0, p0}, Lw3/m$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    return-object p1

    :cond_1
    const-string v2, "com.microsoft.playready"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, La5/j;->K:Ljava/util/regex/Pattern;

    invoke-static {p0, p1, p2}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    sget-object p1, Ls3/i;->e:Ljava/util/UUID;

    invoke-static {p1, p0}, Lf4/l;->a(Ljava/util/UUID;[B)[B

    move-result-object p0

    new-instance p2, Lw3/m$b;

    invoke-direct {p2, p1, v5, p0}, Lw3/m$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    return-object p2

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static l(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "SAMPLE-AES-CENC"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SAMPLE-AES-CTR"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const-string p0, "cbcs"

    goto :goto_1

    :cond_1
    :goto_0
    const-string p0, "cenc"

    :goto_1
    return-object p0
.end method

.method public static m(Ljava/lang/String;Ljava/util/regex/Pattern;)I
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {p0, p1, v0}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static n(Ljava/lang/String;Ljava/util/regex/Pattern;)J
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {p0, p1, v0}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static o(La5/h;La5/g;La5/j$b;Ljava/lang/String;)La5/g;
    .locals 94

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-boolean v2, v0, La5/i;->c:Z

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v7, La5/g$f;

    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v19, 0x0

    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v22, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v24, 0x0

    move-object/from16 v16, v7

    invoke-direct/range {v16 .. v24}, La5/g$f;-><init>(JZJJZ)V

    new-instance v9, Ljava/util/TreeMap;

    invoke-direct {v9}, Ljava/util/TreeMap;-><init>()V

    const-string v10, ""

    const-wide/16 v18, 0x0

    const/4 v13, 0x0

    move/from16 v35, v2

    move-object/from16 v56, v7

    move-object/from16 v41, v10

    move v2, v13

    move/from16 v23, v2

    move/from16 v26, v23

    move/from16 v27, v26

    move/from16 v36, v27

    move/from16 v54, v36

    move/from16 v80, v54

    move/from16 v85, v80

    move-wide/from16 v24, v18

    move-wide/from16 v28, v24

    move-wide/from16 v38, v28

    move-wide/from16 v50, v38

    move-wide/from16 v81, v50

    move-wide/from16 v83, v81

    move-wide/from16 v87, v83

    move-wide/from16 v89, v87

    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v30, 0x1

    const-wide v31, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v33, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v37, 0x0

    const/16 v40, 0x0

    const/16 v75, 0x0

    const-wide/16 v76, -0x1

    const/16 v78, 0x0

    const/16 v79, 0x0

    const/16 v86, 0x0

    move-object v7, v5

    const/4 v5, 0x0

    :cond_0
    :goto_0
    invoke-virtual/range {p2 .. p2}, La5/j$b;->a()Z

    move-result v42

    if-eqz v42, :cond_43

    invoke-virtual/range {p2 .. p2}, La5/j$b;->b()Ljava/lang/String;

    move-result-object v12

    const-string v11, "#EXT"

    invoke-virtual {v12, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    const-string v11, "#EXT-X-PLAYLIST-TYPE"

    invoke-virtual {v12, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_3

    sget-object v11, La5/j;->q:Ljava/util/regex/Pattern;

    invoke-static {v12, v11, v3}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "VOD"

    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const-string v12, "EVENT"

    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    const/4 v2, 0x2

    goto :goto_0

    :cond_3
    const-string v11, "#EXT-X-I-FRAMES-ONLY"

    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    const/16 v85, 0x1

    goto :goto_0

    :cond_4
    const-string v11, "#EXT-X-START"

    invoke-virtual {v12, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    const-wide v43, 0x412e848000000000L    # 1000000.0

    if-eqz v11, :cond_5

    sget-object v11, La5/j;->C:Ljava/util/regex/Pattern;

    invoke-static {v12, v11}, La5/j;->j(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    move-result-wide v21

    move-object/from16 v91, v15

    mul-double v14, v21, v43

    double-to-long v14, v14

    sget-object v11, La5/j;->Y:Ljava/util/regex/Pattern;

    invoke-static {v12, v11, v13}, La5/j;->q(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result v23

    move-wide/from16 v21, v14

    :goto_1
    move-object/from16 v15, v91

    goto :goto_0

    :cond_5
    move-object/from16 v91, v15

    const-string v11, "#EXT-X-SERVER-CONTROL"

    invoke-virtual {v12, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-static {v12}, La5/j;->y(Ljava/lang/String;)La5/g$f;

    move-result-object v56

    goto :goto_1

    :cond_6
    const-string v11, "#EXT-X-PART-INF"

    invoke-virtual {v12, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_7

    sget-object v11, La5/j;->o:Ljava/util/regex/Pattern;

    invoke-static {v12, v11}, La5/j;->j(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    move-result-wide v11

    mul-double v11, v11, v43

    double-to-long v11, v11

    move-wide/from16 v33, v11

    goto :goto_1

    :cond_7
    const-string v11, "#EXT-X-MAP"

    invoke-virtual {v12, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    const-string v14, "@"

    if-eqz v11, :cond_d

    sget-object v11, La5/j;->K:Ljava/util/regex/Pattern;

    invoke-static {v12, v11, v3}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v43

    sget-object v11, La5/j;->E:Ljava/util/regex/Pattern;

    invoke-static {v12, v11, v3}, La5/j;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_8

    invoke-static {v11, v14}, Lp5/n0;->Q0(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    aget-object v12, v11, v13

    invoke-static {v12}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v76

    array-length v12, v11

    const/4 v14, 0x1

    if-le v12, v14, :cond_8

    aget-object v12, v11, v14

    invoke-static {v12}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v38

    :cond_8
    const-wide/16 v14, -0x1

    cmp-long v12, v76, v14

    if-nez v12, :cond_9

    move-wide/from16 v38, v18

    :cond_9
    move-object/from16 v15, v75

    move-object/from16 v14, v78

    if-eqz v15, :cond_b

    if-eqz v14, :cond_a

    goto :goto_2

    :cond_a
    const-string v0, "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ls3/t2;->c(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object v0

    throw v0

    :cond_b
    :goto_2
    const/16 v20, 0x0

    new-instance v86, La5/g$d;

    move-object/from16 v42, v86

    move-wide/from16 v44, v38

    move-wide/from16 v46, v76

    move-object/from16 v48, v15

    move-object/from16 v49, v14

    invoke-direct/range {v42 .. v49}, La5/g$d;-><init>(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V

    if-eqz v12, :cond_c

    add-long v38, v38, v76

    :cond_c
    move-object/from16 v78, v14

    move-object/from16 v75, v15

    move-object/from16 v15, v91

    const-wide/16 v76, -0x1

    goto/16 :goto_0

    :cond_d
    move-object/from16 v15, v75

    move-object/from16 v11, v78

    const/16 v20, 0x0

    const-string v13, "#EXT-X-TARGETDURATION"

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_e

    sget-object v13, La5/j;->m:Ljava/util/regex/Pattern;

    invoke-static {v12, v13}, La5/j;->m(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    move-result v12

    int-to-long v12, v12

    const-wide/32 v31, 0xf4240

    mul-long v31, v31, v12

    :goto_3
    move-object/from16 v78, v11

    move-object/from16 v75, v15

    :goto_4
    move-object/from16 v15, v91

    :goto_5
    const/4 v13, 0x0

    goto/16 :goto_0

    :cond_e
    const-string v13, "#EXT-X-MEDIA-SEQUENCE"

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_f

    sget-object v13, La5/j;->x:Ljava/util/regex/Pattern;

    invoke-static {v12, v13}, La5/j;->n(Ljava/lang/String;Ljava/util/regex/Pattern;)J

    move-result-wide v83

    move-object/from16 v78, v11

    move-object/from16 v75, v15

    move-wide/from16 v28, v83

    goto :goto_4

    :cond_f
    const-string v13, "#EXT-X-VERSION"

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_10

    sget-object v13, La5/j;->p:Ljava/util/regex/Pattern;

    invoke-static {v12, v13}, La5/j;->m(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    move-result v30

    goto :goto_3

    :cond_10
    const-string v13, "#EXT-X-DEFINE"

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_13

    sget-object v13, La5/j;->a0:Ljava/util/regex/Pattern;

    invoke-static {v12, v13, v3}, La5/j;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_11

    iget-object v12, v0, La5/h;->l:Ljava/util/Map;

    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    if-eqz v12, :cond_12

    goto :goto_6

    :cond_11
    sget-object v13, La5/j;->P:Ljava/util/regex/Pattern;

    invoke-static {v12, v13, v3}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v13

    sget-object v14, La5/j;->Z:Ljava/util/regex/Pattern;

    invoke-static {v12, v14, v3}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v12

    :goto_6
    invoke-virtual {v3, v13, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_12
    move-object/from16 v78, v5

    move-object v13, v7

    move-object/from16 v93, v8

    move-object/from16 v92, v10

    move-object/from16 v7, v79

    move-wide/from16 v59, v83

    move-object/from16 v8, v91

    const/4 v0, 0x0

    move/from16 v79, v2

    move-object v2, v6

    goto/16 :goto_17

    :cond_13
    const-string v13, "#EXTINF"

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_14

    sget-object v13, La5/j;->y:Ljava/util/regex/Pattern;

    invoke-static {v12, v13}, La5/j;->A(Ljava/lang/String;Ljava/util/regex/Pattern;)J

    move-result-wide v87

    sget-object v13, La5/j;->z:Ljava/util/regex/Pattern;

    invoke-static {v12, v13, v10, v3}, La5/j;->u(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v41

    goto :goto_3

    :cond_14
    const-string v13, "#EXT-X-SKIP"

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    const-wide/16 v46, 0x1

    if-eqz v13, :cond_1c

    sget-object v13, La5/j;->t:Ljava/util/regex/Pattern;

    invoke-static {v12, v13}, La5/j;->m(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    move-result v12

    if-eqz v1, :cond_15

    invoke-interface/range {v91 .. v91}, Ljava/util/List;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_15

    const/4 v13, 0x1

    goto :goto_7

    :cond_15
    const/4 v13, 0x0

    :goto_7
    invoke-static {v13}, Lp5/a;->f(Z)V

    invoke-static/range {p1 .. p1}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, La5/g;

    iget-wide v13, v13, La5/g;->k:J

    sub-long v13, v28, v13

    long-to-int v13, v13

    add-int/2addr v12, v13

    if-ltz v13, :cond_1b

    iget-object v14, v1, La5/g;->r:Ljava/util/List;

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v14

    if-gt v12, v14, :cond_1b

    move-object/from16 v92, v10

    move-object/from16 v78, v11

    move-wide/from16 v10, v81

    :goto_8
    if-ge v13, v12, :cond_1a

    iget-object v14, v1, La5/g;->r:Ljava/util/List;

    invoke-interface {v14, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, La5/g$d;

    move-object/from16 v55, v7

    move-object/from16 v93, v8

    iget-wide v7, v1, La5/g;->k:J

    cmp-long v7, v28, v7

    if-eqz v7, :cond_16

    iget v7, v1, La5/g;->j:I

    sub-int v7, v7, v27

    iget v8, v14, La5/g$e;->k:I

    add-int/2addr v7, v8

    invoke-virtual {v14, v10, v11, v7}, La5/g$d;->c(JI)La5/g$d;

    move-result-object v14

    :cond_16
    move-object/from16 v8, v91

    invoke-interface {v8, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-wide v0, v14, La5/g$e;->j:J

    add-long/2addr v10, v0

    iget-wide v0, v14, La5/g$e;->q:J

    const-wide/16 v42, -0x1

    cmp-long v7, v0, v42

    move-wide/from16 v42, v10

    if-eqz v7, :cond_17

    iget-wide v10, v14, La5/g$e;->p:J

    add-long/2addr v10, v0

    move-wide/from16 v38, v10

    :cond_17
    iget v0, v14, La5/g$e;->k:I

    iget-object v1, v14, La5/g$e;->i:La5/g$d;

    iget-object v7, v14, La5/g$e;->m:Lw3/m;

    iget-object v15, v14, La5/g$e;->n:Ljava/lang/String;

    iget-object v10, v14, La5/g$e;->o:Ljava/lang/String;

    if-eqz v10, :cond_18

    invoke-static/range {v83 .. v84}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_19

    :cond_18
    iget-object v10, v14, La5/g$e;->o:Ljava/lang/String;

    move-object/from16 v78, v10

    :cond_19
    add-long v83, v83, v46

    add-int/lit8 v13, v13, 0x1

    move/from16 v80, v0

    move-object/from16 v86, v1

    move-object/from16 v40, v7

    move-object/from16 v91, v8

    move-wide/from16 v10, v42

    move-wide/from16 v50, v10

    move-object/from16 v7, v55

    move-object/from16 v8, v93

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    goto :goto_8

    :cond_1a
    move-object/from16 v55, v7

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v81, v10

    move-object/from16 v75, v15

    move-object/from16 v15, v91

    move-object/from16 v10, v92

    goto/16 :goto_5

    :cond_1b
    new-instance v0, La5/j$a;

    invoke-direct {v0}, La5/j$a;-><init>()V

    throw v0

    :cond_1c
    move-object/from16 v55, v7

    move-object/from16 v93, v8

    move-object/from16 v92, v10

    move-object/from16 v8, v91

    const-string v0, "#EXT-X-KEY"

    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_21

    sget-object v0, La5/j;->H:Ljava/util/regex/Pattern;

    invoke-static {v12, v0, v3}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, La5/j;->I:Ljava/util/regex/Pattern;

    const-string v7, "identity"

    invoke-static {v12, v1, v7, v3}, La5/j;->u(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    const-string v10, "NONE"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1d

    invoke-virtual {v9}, Ljava/util/TreeMap;->clear()V

    move-object/from16 v0, v20

    move-object/from16 v40, v0

    move-object/from16 v78, v40

    goto :goto_a

    :cond_1d
    sget-object v10, La5/j;->L:Ljava/util/regex/Pattern;

    invoke-static {v12, v10, v3}, La5/j;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1f

    const-string v1, "AES-128"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1e

    sget-object v0, La5/j;->K:Ljava/util/regex/Pattern;

    invoke-static {v12, v0, v3}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v78, v10

    goto :goto_a

    :cond_1e
    move-object/from16 v78, v10

    move-object/from16 v0, v20

    goto :goto_a

    :cond_1f
    move-object/from16 v7, v79

    if-nez v7, :cond_20

    invoke-static {v0}, La5/j;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v79, v0

    goto :goto_9

    :cond_20
    move-object/from16 v79, v7

    :goto_9
    invoke-static {v12, v1, v3}, La5/j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lw3/m$b;

    move-result-object v0

    if-eqz v0, :cond_1e

    invoke-virtual {v9, v1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v78, v10

    move-object/from16 v0, v20

    move-object/from16 v40, v0

    :goto_a
    move-object/from16 v1, p1

    move-object/from16 v75, v0

    move-object v15, v8

    move-object/from16 v7, v55

    move-object/from16 v10, v92

    move-object/from16 v8, v93

    const/4 v13, 0x0

    goto/16 :goto_18

    :cond_21
    move-object/from16 v7, v79

    const-string v0, "#EXT-X-BYTERANGE"

    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_23

    sget-object v0, La5/j;->D:Ljava/util/regex/Pattern;

    invoke-static {v12, v0, v3}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v14}, Lp5/n0;->Q0(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v10, v0, v1

    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v76

    array-length v1, v0

    const/4 v10, 0x1

    if-le v1, v10, :cond_22

    aget-object v0, v0, v10

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v38

    :cond_22
    :goto_b
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v79, v7

    move-object/from16 v78, v11

    move-object/from16 v75, v15

    move-object/from16 v7, v55

    move-object/from16 v10, v92

    const/4 v13, 0x0

    goto :goto_c

    :cond_23
    const/4 v10, 0x1

    const-string v0, "#EXT-X-DISCONTINUITY-SEQUENCE"

    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/16 v1, 0x3a

    if-eqz v0, :cond_24

    invoke-virtual {v12, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/2addr v0, v10

    invoke-virtual {v12, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v79, v7

    move-object/from16 v78, v11

    move-object/from16 v75, v15

    move-object/from16 v7, v55

    move-object/from16 v10, v92

    const/4 v13, 0x0

    const/16 v26, 0x1

    :goto_c
    move-object v15, v8

    move-object/from16 v8, v93

    goto/16 :goto_0

    :cond_24
    const-string v0, "#EXT-X-DISCONTINUITY"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_25

    add-int/lit8 v80, v80, 0x1

    goto :goto_b

    :cond_25
    const-string v0, "#EXT-X-PROGRAM-DATE-TIME"

    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_27

    cmp-long v0, v24, v18

    if-nez v0, :cond_26

    invoke-virtual {v12, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    invoke-virtual {v12, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lp5/n0;->I0(Ljava/lang/String;)J

    move-result-wide v12

    invoke-static {v12, v13}, Lp5/n0;->B0(J)J

    move-result-wide v12

    sub-long v24, v12, v81

    goto :goto_b

    :cond_26
    move/from16 v79, v2

    move-object/from16 v78, v5

    move-object v2, v6

    :goto_d
    move-object/from16 v13, v55

    move-wide/from16 v59, v83

    :goto_e
    const/4 v0, 0x0

    goto/16 :goto_17

    :cond_27
    const-string v0, "#EXT-X-GAP"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v79, v7

    move-object/from16 v78, v11

    move-object/from16 v75, v15

    move-object/from16 v7, v55

    move-object/from16 v10, v92

    const/4 v13, 0x0

    const/16 v54, 0x1

    goto :goto_c

    :cond_28
    const-string v0, "#EXT-X-INDEPENDENT-SEGMENTS"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v79, v7

    move-object/from16 v78, v11

    move-object/from16 v75, v15

    move-object/from16 v7, v55

    move-object/from16 v10, v92

    const/4 v13, 0x0

    const/16 v35, 0x1

    goto :goto_c

    :cond_29
    const-string v0, "#EXT-X-ENDLIST"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2a

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v79, v7

    move-object/from16 v78, v11

    move-object/from16 v75, v15

    move-object/from16 v7, v55

    move-object/from16 v10, v92

    const/4 v13, 0x0

    const/16 v36, 0x1

    goto/16 :goto_c

    :cond_2a
    const-string v0, "#EXT-X-RENDITION-REPORT"

    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2b

    sget-object v0, La5/j;->A:Ljava/util/regex/Pattern;

    move v10, v2

    const-wide/16 v13, -0x1

    invoke-static {v12, v0, v13, v14}, La5/j;->t(Ljava/lang/String;Ljava/util/regex/Pattern;J)J

    move-result-wide v1

    sget-object v0, La5/j;->B:Ljava/util/regex/Pattern;

    const/4 v13, -0x1

    invoke-static {v12, v0, v13}, La5/j;->s(Ljava/lang/String;Ljava/util/regex/Pattern;I)I

    move-result v0

    sget-object v13, La5/j;->K:Ljava/util/regex/Pattern;

    invoke-static {v12, v13, v3}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v13, p3

    invoke-static {v13, v12}, Lp5/l0;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v12

    new-instance v14, La5/g$c;

    invoke-direct {v14, v12, v1, v2, v0}, La5/g$c;-><init>(Landroid/net/Uri;JI)V

    invoke-interface {v6, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_f
    move-object/from16 v78, v5

    move-object v2, v6

    move/from16 v79, v10

    goto/16 :goto_d

    :cond_2b
    move-object/from16 v13, p3

    move v10, v2

    const-string v0, "#EXT-X-PRELOAD-HINT"

    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_33

    if-eqz v5, :cond_2c

    :goto_10
    goto :goto_f

    :cond_2c
    sget-object v0, La5/j;->N:Ljava/util/regex/Pattern;

    invoke-static {v12, v0, v3}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "PART"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2d

    goto :goto_10

    :cond_2d
    sget-object v0, La5/j;->K:Ljava/util/regex/Pattern;

    invoke-static {v12, v0, v3}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v58

    sget-object v0, La5/j;->F:Ljava/util/regex/Pattern;

    const-wide/16 v1, -0x1

    invoke-static {v12, v0, v1, v2}, La5/j;->t(Ljava/lang/String;Ljava/util/regex/Pattern;J)J

    move-result-wide v42

    sget-object v0, La5/j;->G:Ljava/util/regex/Pattern;

    invoke-static {v12, v0, v1, v2}, La5/j;->t(Ljava/lang/String;Ljava/util/regex/Pattern;J)J

    move-result-wide v70

    move-wide/from16 v0, v83

    invoke-static {v0, v1, v15, v11}, La5/j;->e(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v67

    if-nez v40, :cond_2f

    invoke-virtual {v9}, Ljava/util/TreeMap;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2f

    invoke-virtual {v9}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v2

    const/4 v12, 0x0

    new-array v14, v12, [Lw3/m$b;

    invoke-interface {v2, v14}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lw3/m$b;

    new-instance v12, Lw3/m;

    invoke-direct {v12, v7, v2}, Lw3/m;-><init>(Ljava/lang/String;[Lw3/m$b;)V

    if-nez v37, :cond_2e

    invoke-static {v7, v2}, La5/j;->d(Ljava/lang/String;[Lw3/m$b;)Lw3/m;

    move-result-object v37

    :cond_2e
    move-object/from16 v40, v12

    :cond_2f
    const-wide/16 v46, -0x1

    cmp-long v2, v42, v46

    if-eqz v2, :cond_30

    cmp-long v12, v70, v46

    if-eqz v12, :cond_32

    :cond_30
    new-instance v5, La5/g$b;

    const-wide/16 v60, 0x0

    if-eqz v2, :cond_31

    move-wide/from16 v68, v42

    goto :goto_11

    :cond_31
    move-wide/from16 v68, v18

    :goto_11
    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x1

    move-object/from16 v57, v5

    move-object/from16 v59, v86

    move/from16 v62, v80

    move-wide/from16 v63, v50

    move-object/from16 v65, v40

    move-object/from16 v66, v15

    invoke-direct/range {v57 .. v74}, La5/g$b;-><init>(Ljava/lang/String;La5/g$d;JIJLw3/m;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    :cond_32
    move-wide/from16 v83, v0

    move-object/from16 v79, v7

    move v2, v10

    move-object/from16 v78, v11

    move-object/from16 v75, v15

    move-object/from16 v7, v55

    move-object/from16 v10, v92

    const/4 v13, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    goto/16 :goto_c

    :cond_33
    move-wide/from16 v0, v83

    const-string v2, "#EXT-X-PART"

    invoke-virtual {v12, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3b

    invoke-static {v0, v1, v15, v11}, La5/j;->e(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v67

    sget-object v2, La5/j;->K:Ljava/util/regex/Pattern;

    invoke-static {v12, v2, v3}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v58

    sget-object v2, La5/j;->n:Ljava/util/regex/Pattern;

    invoke-static {v12, v2}, La5/j;->j(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    move-result-wide v46

    move-object/from16 v78, v5

    move-object v2, v6

    mul-double v5, v46, v43

    double-to-long v5, v5

    sget-object v13, La5/j;->W:Ljava/util/regex/Pattern;

    move/from16 v79, v10

    const/4 v10, 0x0

    invoke-static {v12, v13, v10}, La5/j;->q(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result v13

    if-eqz v35, :cond_34

    invoke-interface/range {v55 .. v55}, Ljava/util/List;->isEmpty()Z

    move-result v42

    if-eqz v42, :cond_34

    const/16 v42, 0x1

    goto :goto_12

    :cond_34
    move/from16 v42, v10

    :goto_12
    or-int v73, v13, v42

    sget-object v13, La5/j;->X:Ljava/util/regex/Pattern;

    invoke-static {v12, v13, v10}, La5/j;->q(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result v72

    sget-object v13, La5/j;->E:Ljava/util/regex/Pattern;

    invoke-static {v12, v13, v3}, La5/j;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_35

    invoke-static {v12, v14}, Lp5/n0;->Q0(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    aget-object v13, v12, v10

    invoke-static {v13}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v13

    array-length v10, v12

    move-wide/from16 v42, v13

    const/4 v13, 0x1

    if-le v10, v13, :cond_36

    aget-object v10, v12, v13

    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v89

    goto :goto_13

    :cond_35
    const-wide/16 v42, -0x1

    :cond_36
    :goto_13
    const-wide/16 v44, -0x1

    cmp-long v10, v42, v44

    if-nez v10, :cond_37

    move-wide/from16 v89, v18

    :cond_37
    if-nez v40, :cond_39

    invoke-virtual {v9}, Ljava/util/TreeMap;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_39

    invoke-virtual {v9}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v12

    const/4 v14, 0x0

    new-array v13, v14, [Lw3/m$b;

    invoke-interface {v12, v13}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v12

    check-cast v12, [Lw3/m$b;

    new-instance v13, Lw3/m;

    invoke-direct {v13, v7, v12}, Lw3/m;-><init>(Ljava/lang/String;[Lw3/m$b;)V

    if-nez v37, :cond_38

    invoke-static {v7, v12}, La5/j;->d(Ljava/lang/String;[Lw3/m$b;)Lw3/m;

    move-result-object v37

    :cond_38
    move-object/from16 v40, v13

    :cond_39
    new-instance v12, La5/g$b;

    move-object/from16 v57, v12

    const/16 v74, 0x0

    move-object/from16 v59, v86

    move-wide/from16 v60, v5

    move/from16 v62, v80

    move-wide/from16 v63, v50

    move-object/from16 v65, v40

    move-object/from16 v66, v15

    move-wide/from16 v68, v89

    move-wide/from16 v70, v42

    invoke-direct/range {v57 .. v74}, La5/g$b;-><init>(Ljava/lang/String;La5/g$d;JIJLw3/m;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    move-object/from16 v13, v55

    invoke-interface {v13, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-long v50, v50, v5

    if-eqz v10, :cond_3a

    add-long v89, v89, v42

    :cond_3a
    move-wide/from16 v83, v0

    move-object v6, v2

    move-object/from16 v75, v15

    move-object/from16 v5, v78

    move/from16 v2, v79

    move-object/from16 v10, v92

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v79, v7

    move-object v15, v8

    move-object/from16 v78, v11

    move-object v7, v13

    move-object/from16 v8, v93

    goto/16 :goto_5

    :cond_3b
    move-object/from16 v78, v5

    move-object v2, v6

    move/from16 v79, v10

    move-object/from16 v13, v55

    const-string v5, "#"

    invoke-virtual {v12, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_42

    invoke-static {v0, v1, v15, v11}, La5/j;->e(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    add-long v0, v0, v46

    invoke-static {v12, v3}, La5/j;->B(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La5/g$d;

    const-wide/16 v42, -0x1

    cmp-long v12, v76, v42

    if-nez v12, :cond_3c

    move-wide/from16 v57, v18

    goto :goto_14

    :cond_3c
    if-eqz v85, :cond_3d

    if-nez v86, :cond_3d

    if-nez v10, :cond_3d

    new-instance v10, La5/g$d;

    const-wide/16 v44, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    move-object/from16 v42, v10

    move-object/from16 v43, v6

    move-wide/from16 v46, v38

    invoke-direct/range {v42 .. v49}, La5/g$d;-><init>(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v6, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3d
    move-wide/from16 v57, v38

    :goto_14
    if-nez v40, :cond_3e

    invoke-virtual {v9}, Ljava/util/TreeMap;->isEmpty()Z

    move-result v14

    if-nez v14, :cond_3e

    invoke-virtual {v9}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v14

    move-wide/from16 v59, v0

    const/4 v0, 0x0

    new-array v1, v0, [Lw3/m$b;

    invoke-interface {v14, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lw3/m$b;

    new-instance v14, Lw3/m;

    invoke-direct {v14, v7, v1}, Lw3/m;-><init>(Ljava/lang/String;[Lw3/m$b;)V

    if-nez v37, :cond_3f

    invoke-static {v7, v1}, La5/j;->d(Ljava/lang/String;[Lw3/m$b;)Lw3/m;

    move-result-object v37

    goto :goto_15

    :cond_3e
    move-wide/from16 v59, v0

    const/4 v0, 0x0

    move-object/from16 v14, v40

    :cond_3f
    :goto_15
    new-instance v1, La5/g$d;

    if-eqz v86, :cond_40

    move-object/from16 v40, v86

    goto :goto_16

    :cond_40
    move-object/from16 v40, v10

    :goto_16
    move-object/from16 v38, v1

    move-object/from16 v39, v6

    move-wide/from16 v42, v87

    move/from16 v44, v80

    move-wide/from16 v45, v81

    move-object/from16 v47, v14

    move-object/from16 v48, v15

    move-object/from16 v49, v5

    move-wide/from16 v50, v57

    move-wide/from16 v52, v76

    move-object/from16 v55, v13

    invoke-direct/range {v38 .. v55}, La5/g$d;-><init>(Ljava/lang/String;La5/g$d;Ljava/lang/String;JIJLw3/m;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V

    invoke-interface {v8, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-long v50, v81, v87

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-eqz v12, :cond_41

    add-long v57, v57, v76

    :cond_41
    move-wide/from16 v38, v57

    move v13, v0

    move/from16 v54, v13

    move-object v6, v2

    move-object/from16 v40, v14

    move-object/from16 v75, v15

    move-wide/from16 v87, v18

    move-wide/from16 v81, v50

    move-wide/from16 v83, v59

    move-object/from16 v5, v78

    move/from16 v2, v79

    move-object/from16 v10, v92

    move-object/from16 v41, v10

    const-wide/16 v76, -0x1

    move-object/from16 v0, p0

    move-object/from16 v79, v7

    move-object v15, v8

    move-object/from16 v78, v11

    move-object/from16 v8, v93

    move-object v7, v1

    move-object/from16 v1, p1

    goto/16 :goto_0

    :cond_42
    move-wide/from16 v59, v0

    goto/16 :goto_e

    :goto_17
    move-object/from16 v1, p1

    move-object v6, v2

    move-object/from16 v75, v15

    move-wide/from16 v83, v59

    move-object/from16 v5, v78

    move/from16 v2, v79

    move-object/from16 v10, v92

    move-object/from16 v79, v7

    move-object v15, v8

    move-object/from16 v78, v11

    move-object v7, v13

    move-object/from16 v8, v93

    move v13, v0

    :goto_18
    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_43
    move/from16 v79, v2

    move-object/from16 v78, v5

    move-object v2, v6

    move-object/from16 v93, v8

    move v0, v13

    move-object v8, v15

    move-object v13, v7

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    move v3, v0

    :goto_19
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_48

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La5/g$c;

    iget-wide v5, v4, La5/g$c;->b:J

    const-wide/16 v9, -0x1

    cmp-long v7, v5, v9

    if-nez v7, :cond_44

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v5

    int-to-long v5, v5

    add-long v5, v28, v5

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v7

    int-to-long v11, v7

    sub-long/2addr v5, v11

    :cond_44
    iget v7, v4, La5/g$c;->c:I

    const/4 v11, -0x1

    if-ne v7, v11, :cond_47

    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v12, v33, v14

    if-eqz v12, :cond_46

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_45

    invoke-static {v8}, Li7/b0;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La5/g$d;

    iget-object v7, v7, La5/g$d;->t:Ljava/util/List;

    goto :goto_1a

    :cond_45
    move-object v7, v13

    :goto_1a
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    const/4 v12, 0x1

    sub-int/2addr v7, v12

    goto :goto_1b

    :cond_46
    const/4 v12, 0x1

    goto :goto_1b

    :cond_47
    const/4 v12, 0x1

    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    :goto_1b
    iget-object v4, v4, La5/g$c;->a:Landroid/net/Uri;

    new-instance v0, La5/g$c;

    invoke-direct {v0, v4, v5, v6, v7}, La5/g$c;-><init>(Landroid/net/Uri;JI)V

    invoke-interface {v1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    const/4 v0, 0x0

    goto :goto_19

    :cond_48
    const/4 v12, 0x1

    if-eqz v78, :cond_49

    move-object/from16 v5, v78

    invoke-interface {v13, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_49
    new-instance v0, La5/g;

    cmp-long v2, v24, v18

    if-eqz v2, :cond_4a

    move/from16 v75, v12

    goto :goto_1c

    :cond_4a
    const/16 v75, 0x0

    :goto_1c
    move-object v5, v0

    move/from16 v6, v79

    move-object/from16 v55, v13

    move-object/from16 v7, p3

    move-object v2, v8

    move-object/from16 v8, v93

    move-wide/from16 v9, v21

    move/from16 v11, v23

    move-wide/from16 v12, v24

    move/from16 v14, v26

    move/from16 v15, v27

    move-wide/from16 v16, v28

    move/from16 v18, v30

    move-wide/from16 v19, v31

    move-wide/from16 v21, v33

    move/from16 v23, v35

    move/from16 v24, v36

    move/from16 v25, v75

    move-object/from16 v26, v37

    move-object/from16 v27, v2

    move-object/from16 v28, v55

    move-object/from16 v29, v56

    move-object/from16 v30, v1

    invoke-direct/range {v5 .. v30}, La5/g;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLw3/m;Ljava/util/List;Ljava/util/List;La5/g$f;Ljava/util/Map;)V

    return-object v0
.end method

.method public static p(La5/j$b;Ljava/lang/String;)La5/h;
    .locals 36

    move-object/from16 v1, p1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    const/4 v10, 0x0

    const/4 v13, 0x0

    :goto_0
    invoke-virtual/range {p0 .. p0}, La5/j$b;->a()Z

    move-result v14

    const-string v15, "application/x-mpegURL"

    if-eqz v14, :cond_f

    invoke-virtual/range {p0 .. p0}, La5/j$b;->b()Ljava/lang/String;

    move-result-object v14

    const-string v9, "#EXT"

    invoke-virtual {v14, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    const-string v9, "#EXT-X-I-FRAME-STREAM-INF"

    invoke-virtual {v14, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    move/from16 v19, v10

    const-string v10, "#EXT-X-DEFINE"

    invoke-virtual {v14, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_1

    sget-object v9, La5/j;->P:Ljava/util/regex/Pattern;

    invoke-static {v14, v9, v11}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    sget-object v10, La5/j;->Z:Ljava/util/regex/Pattern;

    invoke-static {v14, v10, v11}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v11, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    const-string v10, "#EXT-X-INDEPENDENT-SEGMENTS"

    invoke-virtual {v14, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    move-object v1, v0

    move-object/from16 v34, v3

    move-object/from16 v33, v4

    move-object/from16 v32, v5

    move-object/from16 v31, v6

    move-object/from16 v29, v7

    move-object/from16 v30, v8

    move-object/from16 v28, v12

    const/4 v10, 0x1

    goto/16 :goto_9

    :cond_2
    const-string v10, "#EXT-X-MEDIA"

    invoke-virtual {v14, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    const-string v10, "#EXT-X-SESSION-KEY"

    invoke-virtual {v14, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_4

    sget-object v9, La5/j;->I:Ljava/util/regex/Pattern;

    const-string v10, "identity"

    invoke-static {v14, v9, v10, v11}, La5/j;->u(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v14, v9, v11}, La5/j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lw3/m$b;

    move-result-object v9

    if-eqz v9, :cond_5

    sget-object v10, La5/j;->H:Ljava/util/regex/Pattern;

    invoke-static {v14, v10, v11}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, La5/j;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    new-instance v14, Lw3/m;

    const/4 v15, 0x1

    new-array v15, v15, [Lw3/m$b;

    const/16 v16, 0x0

    aput-object v9, v15, v16

    invoke-direct {v14, v10, v15}, Lw3/m;-><init>(Ljava/lang/String;[Lw3/m$b;)V

    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    const-string v10, "#EXT-X-STREAM-INF"

    invoke-virtual {v14, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_6

    if-eqz v9, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    move-object v1, v0

    move-object/from16 v34, v3

    move-object/from16 v33, v4

    move-object/from16 v32, v5

    move-object/from16 v31, v6

    move-object/from16 v29, v7

    move-object/from16 v30, v8

    move-object/from16 v28, v12

    move/from16 v10, v19

    goto/16 :goto_9

    :cond_6
    :goto_2
    const-string v10, "CLOSED-CAPTIONS=NONE"

    invoke-virtual {v14, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    or-int/2addr v13, v10

    if-eqz v9, :cond_7

    const/16 v10, 0x4000

    move/from16 v20, v13

    goto :goto_3

    :cond_7
    move/from16 v20, v13

    const/4 v10, 0x0

    :goto_3
    sget-object v13, La5/j;->h:Ljava/util/regex/Pattern;

    invoke-static {v14, v13}, La5/j;->m(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    move-result v13

    move-object/from16 v28, v12

    sget-object v12, La5/j;->c:Ljava/util/regex/Pattern;

    move-object/from16 v29, v7

    const/4 v7, -0x1

    invoke-static {v14, v12, v7}, La5/j;->s(Ljava/lang/String;Ljava/util/regex/Pattern;I)I

    move-result v12

    sget-object v7, La5/j;->j:Ljava/util/regex/Pattern;

    invoke-static {v14, v7, v11}, La5/j;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v30, v8

    sget-object v8, La5/j;->k:Ljava/util/regex/Pattern;

    invoke-static {v14, v8, v11}, La5/j;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v31, v6

    if-eqz v8, :cond_a

    const-string v6, "x"

    invoke-static {v8, v6}, Lp5/n0;->Q0(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    aget-object v21, v6, v8

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    const/16 v18, 0x1

    aget-object v6, v6, v18

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    if-lez v8, :cond_9

    if-gtz v6, :cond_8

    goto :goto_4

    :cond_8
    move/from16 v17, v8

    goto :goto_5

    :cond_9
    :goto_4
    const/4 v6, -0x1

    const/16 v17, -0x1

    :goto_5
    move v8, v6

    move/from16 v6, v17

    goto :goto_6

    :cond_a
    const/4 v6, -0x1

    const/4 v8, -0x1

    :goto_6
    const/high16 v17, -0x40800000    # -1.0f

    move-object/from16 v32, v5

    sget-object v5, La5/j;->l:Ljava/util/regex/Pattern;

    invoke-static {v14, v5, v11}, La5/j;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_b

    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v17

    :cond_b
    move-object/from16 v33, v4

    move/from16 v5, v17

    sget-object v4, La5/j;->d:Ljava/util/regex/Pattern;

    invoke-static {v14, v4, v11}, La5/j;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v34, v3

    sget-object v3, La5/j;->e:Ljava/util/regex/Pattern;

    invoke-static {v14, v3, v11}, La5/j;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v35, v0

    sget-object v0, La5/j;->f:Ljava/util/regex/Pattern;

    invoke-static {v14, v0, v11}, La5/j;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v17, v0

    sget-object v0, La5/j;->g:Ljava/util/regex/Pattern;

    invoke-static {v14, v0, v11}, La5/j;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    if-eqz v9, :cond_c

    sget-object v9, La5/j;->K:Ljava/util/regex/Pattern;

    invoke-static {v14, v9, v11}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    :goto_7
    invoke-static {v1, v9}, Lp5/l0;->e(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v9

    goto :goto_8

    :cond_c
    invoke-virtual/range {p0 .. p0}, La5/j$b;->a()Z

    move-result v9

    if-eqz v9, :cond_e

    invoke-virtual/range {p0 .. p0}, La5/j$b;->b()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v11}, La5/j;->B(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    goto :goto_7

    :goto_8
    new-instance v14, Ls3/m1$b;

    invoke-direct {v14}, Ls3/m1$b;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v14, v1}, Ls3/m1$b;->T(I)Ls3/m1$b;

    move-result-object v1

    invoke-virtual {v1, v15}, Ls3/m1$b;->M(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v1

    invoke-virtual {v1, v7}, Ls3/m1$b;->K(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v1

    invoke-virtual {v1, v12}, Ls3/m1$b;->I(I)Ls3/m1$b;

    move-result-object v1

    invoke-virtual {v1, v13}, Ls3/m1$b;->b0(I)Ls3/m1$b;

    move-result-object v1

    invoke-virtual {v1, v6}, Ls3/m1$b;->n0(I)Ls3/m1$b;

    move-result-object v1

    invoke-virtual {v1, v8}, Ls3/m1$b;->S(I)Ls3/m1$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Ls3/m1$b;->R(F)Ls3/m1$b;

    move-result-object v1

    invoke-virtual {v1, v10}, Ls3/m1$b;->e0(I)Ls3/m1$b;

    move-result-object v1

    invoke-virtual {v1}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v23

    new-instance v1, La5/h$b;

    move-object/from16 v21, v1

    move-object/from16 v22, v9

    move-object/from16 v24, v4

    move-object/from16 v25, v3

    move-object/from16 v26, v17

    move-object/from16 v27, v0

    invoke-direct/range {v21 .. v27}, La5/h$b;-><init>(Landroid/net/Uri;Ls3/m1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v35

    invoke-virtual {v1, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    if-nez v5, :cond_d

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, v9, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    new-instance v6, Lz4/r$b;

    move-object/from16 v21, v6

    move/from16 v22, v12

    move/from16 v23, v13

    move-object/from16 v24, v4

    move-object/from16 v25, v3

    move-object/from16 v26, v17

    move-object/from16 v27, v0

    invoke-direct/range {v21 .. v27}, Lz4/r$b;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v10, v19

    move/from16 v13, v20

    :goto_9
    move-object v0, v1

    move-object/from16 v12, v28

    move-object/from16 v7, v29

    move-object/from16 v8, v30

    move-object/from16 v6, v31

    move-object/from16 v5, v32

    move-object/from16 v4, v33

    move-object/from16 v3, v34

    move-object/from16 v1, p1

    goto/16 :goto_0

    :cond_e
    const-string v0, "#EXT-X-STREAM-INF must be followed by another line"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ls3/t2;->c(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object v0

    throw v0

    :cond_f
    move-object v1, v0

    move-object/from16 v34, v3

    move-object/from16 v33, v4

    move-object/from16 v32, v5

    move-object/from16 v31, v6

    move-object/from16 v29, v7

    move-object/from16 v30, v8

    move/from16 v19, v10

    move-object/from16 v28, v12

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v4, 0x0

    :goto_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_12

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La5/h$b;

    iget-object v6, v5, La5/h$b;->a:Landroid/net/Uri;

    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_11

    iget-object v6, v5, La5/h$b;->b:Ls3/m1;

    iget-object v6, v6, Ls3/m1;->q:Lk4/a;

    if-nez v6, :cond_10

    const/4 v6, 0x1

    goto :goto_b

    :cond_10
    const/4 v6, 0x0

    :goto_b
    invoke-static {v6}, Lp5/a;->f(Z)V

    new-instance v6, Lz4/r;

    iget-object v7, v5, La5/h$b;->a:Landroid/net/Uri;

    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/ArrayList;

    invoke-static {v7}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    const/4 v8, 0x0

    invoke-direct {v6, v8, v8, v7}, Lz4/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v7, Lk4/a;

    const/4 v9, 0x1

    new-array v10, v9, [Lk4/a$b;

    const/4 v9, 0x0

    aput-object v6, v10, v9

    invoke-direct {v7, v10}, Lk4/a;-><init>([Lk4/a$b;)V

    iget-object v6, v5, La5/h$b;->b:Ls3/m1;

    invoke-virtual {v6}, Ls3/m1;->b()Ls3/m1$b;

    move-result-object v6

    invoke-virtual {v6, v7}, Ls3/m1$b;->Z(Lk4/a;)Ls3/m1$b;

    move-result-object v6

    invoke-virtual {v6}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v6

    invoke-virtual {v5, v6}, La5/h$b;->a(Ls3/m1;)La5/h$b;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_11
    const/4 v8, 0x0

    :goto_c
    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_12
    const/4 v8, 0x0

    move-object v1, v8

    move-object v9, v1

    const/4 v0, 0x0

    :goto_d
    invoke-virtual/range {v34 .. v34}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v0, v4, :cond_24

    move-object/from16 v4, v34

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    sget-object v6, La5/j;->Q:Ljava/util/regex/Pattern;

    invoke-static {v5, v6, v11}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    sget-object v7, La5/j;->P:Ljava/util/regex/Pattern;

    invoke-static {v5, v7, v11}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    new-instance v10, Ls3/m1$b;

    invoke-direct {v10}, Ls3/m1$b;-><init>()V

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, ":"

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v12}, Ls3/m1$b;->U(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v10

    invoke-virtual {v10, v7}, Ls3/m1$b;->W(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v10

    invoke-virtual {v10, v15}, Ls3/m1$b;->M(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v10

    invoke-static {v5}, La5/j;->x(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v10, v12}, Ls3/m1$b;->i0(I)Ls3/m1$b;

    move-result-object v10

    invoke-static {v5, v11}, La5/j;->w(Ljava/lang/String;Ljava/util/Map;)I

    move-result v12

    invoke-virtual {v10, v12}, Ls3/m1$b;->e0(I)Ls3/m1$b;

    move-result-object v10

    sget-object v12, La5/j;->O:Ljava/util/regex/Pattern;

    invoke-static {v5, v12, v11}, La5/j;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v12}, Ls3/m1$b;->X(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v10

    sget-object v12, La5/j;->K:Ljava/util/regex/Pattern;

    invoke-static {v5, v12, v11}, La5/j;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v14, p1

    if-nez v12, :cond_13

    move-object v12, v8

    goto :goto_e

    :cond_13
    invoke-static {v14, v12}, Lp5/l0;->e(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v12

    :goto_e
    new-instance v8, Lk4/a;

    move-object/from16 v34, v4

    const/4 v4, 0x1

    new-array v14, v4, [Lk4/a$b;

    new-instance v4, Lz4/r;

    move-object/from16 v20, v15

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v15

    invoke-direct {v4, v6, v7, v15}, Lz4/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    const/4 v15, 0x0

    aput-object v4, v14, v15

    invoke-direct {v8, v14}, Lk4/a;-><init>([Lk4/a$b;)V

    sget-object v4, La5/j;->M:Ljava/util/regex/Pattern;

    invoke-static {v5, v4, v11}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v14

    const/4 v15, 0x2

    sparse-switch v14, :sswitch_data_0

    :goto_f
    const/4 v4, -0x1

    goto :goto_10

    :sswitch_0
    const-string v14, "VIDEO"

    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_14

    goto :goto_f

    :cond_14
    const/4 v4, 0x3

    goto :goto_10

    :sswitch_1
    const-string v14, "AUDIO"

    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_15

    goto :goto_f

    :cond_15
    move v4, v15

    goto :goto_10

    :sswitch_2
    const-string v14, "CLOSED-CAPTIONS"

    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    goto :goto_f

    :cond_16
    const/4 v4, 0x1

    goto :goto_10

    :sswitch_3
    const-string v14, "SUBTITLES"

    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_17

    goto :goto_f

    :cond_17
    const/4 v4, 0x0

    :goto_10
    packed-switch v4, :pswitch_data_0

    :goto_11
    move-object/from16 v21, v9

    move-object/from16 v6, v31

    move-object/from16 v9, v32

    move-object/from16 v14, v33

    :goto_12
    const/16 v16, 0x0

    goto/16 :goto_18

    :pswitch_0
    invoke-static {v2, v6}, La5/j;->h(Ljava/util/ArrayList;Ljava/lang/String;)La5/h$b;

    move-result-object v4

    if-eqz v4, :cond_18

    iget-object v4, v4, La5/h$b;->b:Ls3/m1;

    iget-object v5, v4, Ls3/m1;->p:Ljava/lang/String;

    invoke-static {v5, v15}, Lp5/n0;->L(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v10, v5}, Ls3/m1$b;->K(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v14

    invoke-static {v5}, Lp5/v;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v14, v5}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v5

    iget v14, v4, Ls3/m1;->x:I

    invoke-virtual {v5, v14}, Ls3/m1$b;->n0(I)Ls3/m1$b;

    move-result-object v5

    iget v14, v4, Ls3/m1;->y:I

    invoke-virtual {v5, v14}, Ls3/m1$b;->S(I)Ls3/m1$b;

    move-result-object v5

    iget v4, v4, Ls3/m1;->z:F

    invoke-virtual {v5, v4}, Ls3/m1$b;->R(F)Ls3/m1$b;

    :cond_18
    if-nez v12, :cond_19

    goto :goto_11

    :cond_19
    invoke-virtual {v10, v8}, Ls3/m1$b;->Z(Lk4/a;)Ls3/m1$b;

    new-instance v4, La5/h$a;

    invoke-virtual {v10}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v5

    invoke-direct {v4, v12, v5, v6, v7}, La5/h$a;-><init>(Landroid/net/Uri;Ls3/m1;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v14, v33

    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v21, v9

    move-object/from16 v6, v31

    move-object/from16 v9, v32

    goto :goto_12

    :pswitch_1
    move-object/from16 v14, v33

    invoke-static {v2, v6}, La5/j;->f(Ljava/util/ArrayList;Ljava/lang/String;)La5/h$b;

    move-result-object v4

    if-eqz v4, :cond_1a

    iget-object v15, v4, La5/h$b;->b:Ls3/m1;

    iget-object v15, v15, Ls3/m1;->p:Ljava/lang/String;

    move-object/from16 v21, v9

    const/4 v9, 0x1

    invoke-static {v15, v9}, Lp5/n0;->L(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v10, v15}, Ls3/m1$b;->K(Ljava/lang/String;)Ls3/m1$b;

    invoke-static {v15}, Lp5/v;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    goto :goto_13

    :cond_1a
    move-object/from16 v21, v9

    const/4 v15, 0x0

    :goto_13
    sget-object v9, La5/j;->i:Ljava/util/regex/Pattern;

    invoke-static {v5, v9, v11}, La5/j;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1b

    const-string v9, "/"

    invoke-static {v5, v9}, Lp5/n0;->R0(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    const/16 v16, 0x0

    aget-object v9, v9, v16

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    invoke-virtual {v10, v9}, Ls3/m1$b;->J(I)Ls3/m1$b;

    const-string v9, "audio/eac3"

    invoke-virtual {v9, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1c

    const-string v9, "/JOC"

    invoke-virtual {v5, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1c

    const-string v5, "ec+3"

    invoke-virtual {v10, v5}, Ls3/m1$b;->K(Ljava/lang/String;)Ls3/m1$b;

    const-string v15, "audio/eac3-joc"

    goto :goto_14

    :cond_1b
    const/16 v16, 0x0

    :cond_1c
    :goto_14
    invoke-virtual {v10, v15}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    if-eqz v12, :cond_1d

    invoke-virtual {v10, v8}, Ls3/m1$b;->Z(Lk4/a;)Ls3/m1$b;

    new-instance v4, La5/h$a;

    invoke-virtual {v10}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v5

    invoke-direct {v4, v12, v5, v6, v7}, La5/h$a;-><init>(Landroid/net/Uri;Ls3/m1;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v9, v32

    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_16

    :cond_1d
    move-object/from16 v9, v32

    if-eqz v4, :cond_20

    invoke-virtual {v10}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v4

    move-object/from16 v21, v4

    goto :goto_16

    :pswitch_2
    move-object/from16 v21, v9

    move-object/from16 v9, v32

    move-object/from16 v14, v33

    const/16 v16, 0x0

    sget-object v4, La5/j;->S:Ljava/util/regex/Pattern;

    invoke-static {v5, v4, v11}, La5/j;->z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "CC"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1e

    invoke-virtual {v4, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    const-string v5, "application/cea-608"

    goto :goto_15

    :cond_1e
    const/4 v5, 0x7

    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    const-string v5, "application/cea-708"

    :goto_15
    if-nez v1, :cond_1f

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_1f
    invoke-virtual {v10, v5}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v5

    invoke-virtual {v5, v4}, Ls3/m1$b;->H(I)Ls3/m1$b;

    invoke-virtual {v10}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_20
    :goto_16
    move-object/from16 v6, v31

    goto :goto_18

    :pswitch_3
    move-object/from16 v21, v9

    move-object/from16 v9, v32

    move-object/from16 v14, v33

    const/16 v16, 0x0

    invoke-static {v2, v6}, La5/j;->g(Ljava/util/ArrayList;Ljava/lang/String;)La5/h$b;

    move-result-object v4

    if-eqz v4, :cond_21

    iget-object v4, v4, La5/h$b;->b:Ls3/m1;

    iget-object v4, v4, Ls3/m1;->p:Ljava/lang/String;

    const/4 v5, 0x3

    invoke-static {v4, v5}, Lp5/n0;->L(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v10, v4}, Ls3/m1$b;->K(Ljava/lang/String;)Ls3/m1$b;

    invoke-static {v4}, Lp5/v;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_17

    :cond_21
    const/4 v4, 0x0

    :goto_17
    if-nez v4, :cond_22

    const-string v4, "text/vtt"

    :cond_22
    invoke-virtual {v10, v4}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v4

    invoke-virtual {v4, v8}, Ls3/m1$b;->Z(Lk4/a;)Ls3/m1$b;

    if-eqz v12, :cond_23

    new-instance v4, La5/h$a;

    invoke-virtual {v10}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v5

    invoke-direct {v4, v12, v5, v6, v7}, La5/h$a;-><init>(Landroid/net/Uri;Ls3/m1;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v6, v31

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_18

    :cond_23
    move-object/from16 v6, v31

    const-string v4, "HlsPlaylistParser"

    const-string v5, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"

    invoke-static {v4, v5}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    :goto_18
    add-int/lit8 v0, v0, 0x1

    move-object/from16 v31, v6

    move-object/from16 v32, v9

    move-object/from16 v33, v14

    move-object/from16 v15, v20

    move-object/from16 v9, v21

    const/4 v8, 0x0

    goto/16 :goto_d

    :cond_24
    move-object/from16 v21, v9

    move-object/from16 v6, v31

    move-object/from16 v9, v32

    move-object/from16 v14, v33

    if-eqz v13, :cond_25

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    move-object v10, v0

    goto :goto_19

    :cond_25
    move-object v10, v1

    :goto_19
    new-instance v13, La5/h;

    move-object v0, v13

    move-object/from16 v1, p1

    move-object/from16 v2, v30

    move-object v4, v14

    move-object v5, v9

    move-object/from16 v7, v29

    move-object/from16 v8, v21

    move-object v9, v10

    move/from16 v10, v19

    move-object/from16 v12, v28

    invoke-direct/range {v0 .. v12}, La5/h;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ls3/m1;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;)V

    return-object v13

    :sswitch_data_0
    .sparse-switch
        -0x392db8c5 -> :sswitch_3
        -0x13dc6572 -> :sswitch_2
        0x3bba3b6 -> :sswitch_1
        0x4de1c5b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static q(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z
    .locals 0

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "YES"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_0
    return p2
.end method

.method public static r(Ljava/lang/String;Ljava/util/regex/Pattern;D)D
    .locals 0

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide p0

    return-wide p0

    :cond_0
    return-wide p2
.end method

.method public static s(Ljava/lang/String;Ljava/util/regex/Pattern;I)I
    .locals 0

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_0
    return p2
.end method

.method public static t(Ljava/lang/String;Ljava/util/regex/Pattern;J)J
    .locals 0

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p0

    return-wide p0

    :cond_0
    return-wide p2
.end method

.method public static u(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/regex/Pattern;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    move-object p2, p0

    check-cast p2, Ljava/lang/String;

    :cond_0
    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p2, p3}, La5/j;->B(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p2

    :cond_2
    :goto_0
    return-object p2
.end method

.method public static v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/regex/Pattern;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, p1, v0, p2}, La5/j;->u(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static w(Ljava/lang/String;Ljava/util/Map;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    sget-object v0, La5/j;->R:Ljava/util/regex/Pattern;

    invoke-static {p0, v0, p1}, La5/j;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    return v0

    :cond_0
    const-string p1, ","

    invoke-static {p0, p1}, Lp5/n0;->Q0(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    const-string p1, "public.accessibility.describes-video"

    invoke-static {p0, p1}, Lp5/n0;->s([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v0, 0x200

    :cond_1
    const-string p1, "public.accessibility.transcribes-spoken-dialog"

    invoke-static {p0, p1}, Lp5/n0;->s([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    or-int/lit16 v0, v0, 0x1000

    :cond_2
    const-string p1, "public.accessibility.describes-music-and-sound"

    invoke-static {p0, p1}, Lp5/n0;->s([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    or-int/lit16 v0, v0, 0x400

    :cond_3
    const-string p1, "public.easy-to-read"

    invoke-static {p0, p1}, Lp5/n0;->s([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    or-int/lit16 v0, v0, 0x2000

    :cond_4
    return v0
.end method

.method public static x(Ljava/lang/String;)I
    .locals 3

    sget-object v0, La5/j;->U:Ljava/util/regex/Pattern;

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, La5/j;->q(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result v0

    sget-object v2, La5/j;->V:Ljava/util/regex/Pattern;

    invoke-static {p0, v2, v1}, La5/j;->q(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    or-int/lit8 v0, v0, 0x2

    :cond_0
    sget-object v2, La5/j;->T:Ljava/util/regex/Pattern;

    invoke-static {p0, v2, v1}, La5/j;->q(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result p0

    if-eqz p0, :cond_1

    or-int/lit8 v0, v0, 0x4

    :cond_1
    return v0
.end method

.method public static y(Ljava/lang/String;)La5/g$f;
    .locals 19

    move-object/from16 v0, p0

    sget-object v1, La5/j;->r:Ljava/util/regex/Pattern;

    const-wide/high16 v2, -0x3c20000000000000L    # -9.223372036854776E18

    invoke-static {v0, v1, v2, v3}, La5/j;->r(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    move-result-wide v4

    cmpl-double v1, v4, v2

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v8, 0x412e848000000000L    # 1000000.0

    if-nez v1, :cond_0

    move-wide v11, v6

    goto :goto_0

    :cond_0
    mul-double/2addr v4, v8

    double-to-long v4, v4

    move-wide v11, v4

    :goto_0
    sget-object v1, La5/j;->s:Ljava/util/regex/Pattern;

    const/4 v4, 0x0

    invoke-static {v0, v1, v4}, La5/j;->q(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result v13

    sget-object v1, La5/j;->u:Ljava/util/regex/Pattern;

    invoke-static {v0, v1, v2, v3}, La5/j;->r(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    move-result-wide v14

    cmpl-double v1, v14, v2

    if-nez v1, :cond_1

    move-wide v14, v6

    goto :goto_1

    :cond_1
    mul-double/2addr v14, v8

    double-to-long v14, v14

    :goto_1
    sget-object v1, La5/j;->v:Ljava/util/regex/Pattern;

    invoke-static {v0, v1, v2, v3}, La5/j;->r(Ljava/lang/String;Ljava/util/regex/Pattern;D)D

    move-result-wide v16

    cmpl-double v1, v16, v2

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    mul-double v1, v16, v8

    double-to-long v6, v1

    :goto_2
    move-wide/from16 v16, v6

    sget-object v1, La5/j;->w:Ljava/util/regex/Pattern;

    invoke-static {v0, v1, v4}, La5/j;->q(Ljava/lang/String;Ljava/util/regex/Pattern;Z)Z

    move-result v18

    new-instance v0, La5/g$f;

    move-object v10, v0

    invoke-direct/range {v10 .. v18}, La5/g$f;-><init>(JZJJZ)V

    return-object v0
.end method

.method public static z(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/regex/Pattern;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, La5/j;->v(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    return-object p2

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Couldn\'t match "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " in "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Ls3/t2;->c(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public bridge synthetic a(Landroid/net/Uri;Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, La5/j;->i(Landroid/net/Uri;Ljava/io/InputStream;)La5/i;

    move-result-object p1

    return-object p1
.end method

.method public i(Landroid/net/Uri;Ljava/io/InputStream;)La5/i;
    .locals 4

    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    new-instance p2, Ljava/util/ArrayDeque;

    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    :try_start_0
    invoke-static {v0}, La5/j;->b(Ljava/io/BufferedReader;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v3, "#EXT-X-STREAM-INF"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p2, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    new-instance v1, La5/j$b;

    invoke-direct {v1, p2, v0}, La5/j$b;-><init>(Ljava/util/Queue;Ljava/io/BufferedReader;)V

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, La5/j;->p(La5/j$b;Ljava/lang/String;)La5/h;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Lp5/n0;->n(Ljava/io/Closeable;)V

    return-object p1

    :cond_1
    :try_start_1
    const-string v3, "#EXT-X-TARGETDURATION"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "#EXT-X-MEDIA-SEQUENCE"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "#EXTINF"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "#EXT-X-KEY"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "#EXT-X-BYTERANGE"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "#EXT-X-DISCONTINUITY"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "#EXT-X-DISCONTINUITY-SEQUENCE"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "#EXT-X-ENDLIST"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p2, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    :goto_1
    invoke-interface {p2, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, La5/j;->a:La5/h;

    iget-object v2, p0, La5/j;->b:La5/g;

    new-instance v3, La5/j$b;

    invoke-direct {v3, p2, v0}, La5/j$b;-><init>(Ljava/util/Queue;Ljava/io/BufferedReader;)V

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, v2, v3, p1}, La5/j;->o(La5/h;La5/g;La5/j$b;Ljava/lang/String;)La5/g;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v0}, Lp5/n0;->n(Ljava/io/Closeable;)V

    return-object p1

    :cond_4
    invoke-static {v0}, Lp5/n0;->n(Ljava/io/Closeable;)V

    const-string p1, "Failed to parse the playlist, could not identify any tags."

    invoke-static {p1, v2}, Ls3/t2;->c(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p1

    throw p1

    :cond_5
    :try_start_2
    const-string p1, "Input does not start with the #EXTM3U header."

    invoke-static {p1, v2}, Ls3/t2;->c(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p1

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    invoke-static {v0}, Lp5/n0;->n(Ljava/io/Closeable;)V

    throw p1
.end method
