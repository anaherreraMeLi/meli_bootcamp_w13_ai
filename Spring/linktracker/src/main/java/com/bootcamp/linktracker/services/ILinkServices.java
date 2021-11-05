package com.bootcamp.linktracker.services;

import com.bootcamp.linktracker.dto.LinkDTO;
import com.bootcamp.linktracker.dto.LinkIdDTO;
import com.bootcamp.linktracker.dto.LinkMetricsDTO;

public interface ILinkServices {
    public LinkIdDTO createLink(LinkDTO link);
    public String redirect(int linkId);
    public LinkMetricsDTO getMetrics(int linkId);
    public void invalidateLink(LinkIdDTO linkId);
}
