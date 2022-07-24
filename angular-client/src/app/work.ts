import {Artist} from "./artist";

export class Work {
  id: number | undefined;
  title: string | undefined;
  creationDate: string | undefined;
  description: string | undefined;
  artist: Artist = new Artist();
}
